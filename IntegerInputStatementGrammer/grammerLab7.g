grammar grammerLab7;

@header { 
package lab6;
import java.util.HashMap;
import java.util.Scanner; 
}

@lexer::header{ package lab6;}

@members {

HashMap memory = new HashMap();
Scanner sc = new Scanner(System.in); 
}


program : statement+ ;

statement :print
	 | println
         | 'LET' ID '=' expr {memory.put($ID.text, new Integer($expr.value));}
         | 'INTEGER' idlist
         | 'INPUT' inputlist
	 ;

print : 'PRINT' STRING {System.out.print($STRING.text.replaceAll("^\"|\"$", ""));}
	| 'PRINT' expr {System.out.print($expr.value);}
	;
println : 'PRINTLN' STRING {System.out.println($STRING.text.replaceAll("^\"|\"$", ""));}
	| 'PRINTLN' expr {System.out.println($expr.value);}
	;



expr returns [int value]

: e=multExpr {$value = $e.value;}

( '+' e=multExpr {$value += $e.value; }

| '-' e=multExpr {$value -= $e.value;}

)*

;


multExpr returns [int value]

: e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;}
	|	'/' e=atom {$value /= $e.value;}
)*

;


atom returns [int value]

: INT {$value = Integer.parseInt($INT.text);}

| ID

{

Integer v = (Integer)memory.get($ID.text);

if ( v!=null ) $value = v.intValue();

else System.err.println("undefined variable "+$ID.text);

}

| '(' expr ')' {$value = $expr.value;}

;

idlist 	: idname  (',' idname)*;

idname 	: ID {if(memory.containsKey($ID.text)) 
                System.out.println("Error: "+$ID.text+ 
                                   " already defined");
              else 
                memory.put($ID.text, 0); };
                
inputlist : inputname (',' inputname)*;	 

inputname :	ID {
	if(memory.containsKey($ID.text))
	  memory.put($ID.text, sc.nextInt());
	else
	 System.out.println("Error: "+$ID.text+ 
                                   " Undefined ID");
	};


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
