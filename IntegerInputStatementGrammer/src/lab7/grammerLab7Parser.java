// $ANTLR 3.5.1 C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g 2021-02-21 20:29:38
 
package lab7;
import java.util.HashMap;
import java.util.Scanner; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammerLab7Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", 
		"'='", "'INPUT'", "'INTEGER'", "'LET'", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int STRING=13;
	public static final int UNICODE_ESC=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public grammerLab7Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammerLab7Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return grammerLab7Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g"; }



	HashMap memory = new HashMap();
	Scanner sc = new Scanner(System.in); 



	// $ANTLR start "program"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:18:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:18:9: ( ( statement )+ )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:18:11: ( statement )+
			{
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:18:11: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 24 && LA1_0 <= 28)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:18:11: statement
					{
					pushFollow(FOLLOW_statement_in_program31);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:20:1: statement : ( print | println | 'LET' ID '=' expr | 'INTEGER' idlist | 'INPUT' inputlist );
	public final void statement() throws RecognitionException {
		Token ID1=null;
		int expr2 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:20:11: ( print | println | 'LET' ID '=' expr | 'INTEGER' idlist | 'INPUT' inputlist )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt2=1;
				}
				break;
			case 28:
				{
				alt2=2;
				}
				break;
			case 26:
				{
				alt2=3;
				}
				break;
			case 25:
				{
				alt2=4;
				}
				break;
			case 24:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:20:12: print
					{
					pushFollow(FOLLOW_print_in_statement40);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:21:5: println
					{
					pushFollow(FOLLOW_println_in_statement46);
					println();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:22:12: 'LET' ID '=' expr
					{
					match(input,26,FOLLOW_26_in_statement59); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_statement61); 
					match(input,23,FOLLOW_23_in_statement63); 
					pushFollow(FOLLOW_expr_in_statement65);
					expr2=expr();
					state._fsp--;

					memory.put((ID1!=null?ID1.getText():null), new Integer(expr2));
					}
					break;
				case 4 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:23:12: 'INTEGER' idlist
					{
					match(input,25,FOLLOW_25_in_statement80); 
					pushFollow(FOLLOW_idlist_in_statement82);
					idlist();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:24:12: 'INPUT' inputlist
					{
					match(input,24,FOLLOW_24_in_statement95); 
					pushFollow(FOLLOW_inputlist_in_statement97);
					inputlist();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "print"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:27:1: print : ( 'PRINT' STRING | 'PRINT' expr );
	public final void print() throws RecognitionException {
		Token STRING3=null;
		int expr4 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:27:7: ( 'PRINT' STRING | 'PRINT' expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==27) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==STRING) ) {
					alt3=1;
				}
				else if ( ((LA3_1 >= ID && LA3_1 <= INT)||LA3_1==16) ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:27:9: 'PRINT' STRING
					{
					match(input,27,FOLLOW_27_in_print108); 
					STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_print110); 
					System.out.print((STRING3!=null?STRING3.getText():null).replaceAll("^\"|\"$", ""));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:28:4: 'PRINT' expr
					{
					match(input,27,FOLLOW_27_in_print117); 
					pushFollow(FOLLOW_expr_in_print119);
					expr4=expr();
					state._fsp--;

					System.out.print(expr4);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"



	// $ANTLR start "println"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:30:1: println : ( 'PRINTLN' STRING | 'PRINTLN' expr );
	public final void println() throws RecognitionException {
		Token STRING5=null;
		int expr6 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:30:9: ( 'PRINTLN' STRING | 'PRINTLN' expr )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==STRING) ) {
					alt4=1;
				}
				else if ( ((LA4_1 >= ID && LA4_1 <= INT)||LA4_1==16) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:30:11: 'PRINTLN' STRING
					{
					match(input,28,FOLLOW_28_in_println130); 
					STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_println132); 
					System.out.println((STRING5!=null?STRING5.getText():null).replaceAll("^\"|\"$", ""));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:31:4: 'PRINTLN' expr
					{
					match(input,28,FOLLOW_28_in_println139); 
					pushFollow(FOLLOW_expr_in_println141);
					expr6=expr();
					state._fsp--;

					System.out.println(expr6);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "println"



	// $ANTLR start "expr"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:36:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:38:3: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:38:3: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr162);
			e=multExpr();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:40:3: ( '+' e= multExpr | '-' e= multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19) ) {
					alt5=1;
				}
				else if ( (LA5_0==21) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:40:3: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr169); 
					pushFollow(FOLLOW_multExpr_in_expr173);
					e=multExpr();
					state._fsp--;

					value += e; 
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:42:3: '-' e= multExpr
					{
					match(input,21,FOLLOW_21_in_expr180); 
					pushFollow(FOLLOW_multExpr_in_expr184);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:49:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:51:3: (e= atom ( '*' e= atom | '/' e= atom )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:51:3: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr208);
			e=atom();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:51:31: ( '*' e= atom | '/' e= atom )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==18) ) {
					alt6=1;
				}
				else if ( (LA6_0==22) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:51:32: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr213); 
					pushFollow(FOLLOW_atom_in_multExpr217);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:52:4: '/' e= atom
					{
					match(input,22,FOLLOW_22_in_multExpr224); 
					pushFollow(FOLLOW_atom_in_multExpr228);
					e=atom();
					state._fsp--;

					value /= e;
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:58:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:60:3: ( INT | ID | '(' expr ')' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case ID:
				{
				alt7=2;
				}
				break;
			case 16:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:60:3: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom249); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:62:3: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom256); 


					Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));

					if ( v!=null ) value = v.intValue();

					else System.err.println("undefined variable "+(ID8!=null?ID8.getText():null));


					}
					break;
				case 3 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:74:3: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom264); 
					pushFollow(FOLLOW_expr_in_atom266);
					expr9=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom268); 
					value = expr9;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"



	// $ANTLR start "idlist"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:78:1: idlist : idname ( ',' idname )* ;
	public final void idlist() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:78:9: ( idname ( ',' idname )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:78:11: idname ( ',' idname )*
			{
			pushFollow(FOLLOW_idname_in_idlist281);
			idname();
			state._fsp--;

			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:78:19: ( ',' idname )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==20) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:78:20: ',' idname
					{
					match(input,20,FOLLOW_20_in_idlist285); 
					pushFollow(FOLLOW_idname_in_idlist287);
					idname();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idlist"



	// $ANTLR start "idname"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:80:1: idname : ID ;
	public final void idname() throws RecognitionException {
		Token ID10=null;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:80:9: ( ID )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:80:11: ID
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_idname298); 
			if(memory.containsKey((ID10!=null?ID10.getText():null))) 
			                System.out.println("Error: "+(ID10!=null?ID10.getText():null)+ 
			                                   " already defined");
			              else 
			                memory.put((ID10!=null?ID10.getText():null), 0); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idname"



	// $ANTLR start "inputlist"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:86:1: inputlist : inputname ( ',' inputname )* ;
	public final void inputlist() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:86:11: ( inputname ( ',' inputname )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:86:13: inputname ( ',' inputname )*
			{
			pushFollow(FOLLOW_inputname_in_inputlist324);
			inputname();
			state._fsp--;

			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:86:23: ( ',' inputname )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==20) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:86:24: ',' inputname
					{
					match(input,20,FOLLOW_20_in_inputlist327); 
					pushFollow(FOLLOW_inputname_in_inputlist329);
					inputname();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inputlist"



	// $ANTLR start "inputname"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:88:1: inputname : ID ;
	public final void inputname() throws RecognitionException {
		Token ID11=null;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:88:11: ( ID )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab7.g:88:13: ID
			{
			ID11=(Token)match(input,ID,FOLLOW_ID_in_inputname341); 

				if(memory.containsKey((ID11!=null?ID11.getText():null)))
				  memory.put((ID11!=null?ID11.getText():null), sc.nextInt());
				else
				 System.out.println("Error: "+(ID11!=null?ID11.getText():null)+ 
			                                   " Undefined ID");
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inputname"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program31 = new BitSet(new long[]{0x000000001F000002L});
	public static final BitSet FOLLOW_print_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_statement59 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_statement61 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_statement63 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_statement65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_statement80 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idlist_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_statement95 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_inputlist_in_statement97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_print108 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_print110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_print117 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_print119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_println130 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_println132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_println139 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_println141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr162 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_expr169 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr173 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_expr180 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr184 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_atom_in_multExpr208 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_18_in_multExpr213 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr217 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_22_in_multExpr224 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr228 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_INT_in_atom249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom264 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom266 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idname_in_idlist281 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_idlist285 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_idname_in_idlist287 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_idname298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputname_in_inputlist324 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_inputlist327 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_inputname_in_inputlist329 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ID_in_inputname341 = new BitSet(new long[]{0x0000000000000002L});
}
