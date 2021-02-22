// $ANTLR 3.5.1 C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g 2021-02-21 20:11:51
 
package lab5;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammerLab5Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'PRINT'", 
		"'PRINTLN'"
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


	public grammerLab5Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammerLab5Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return grammerLab5Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g"; }



	HashMap memory = new HashMap();




	// $ANTLR start "program"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:17:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:17:9: ( ( statement )+ )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:17:11: ( statement )+
			{
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:17:11: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 22 && LA1_0 <= 23)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:17:11: statement
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:19:1: statement : ( print | println );
	public final void statement() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:19:11: ( print | println )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==22) ) {
				alt2=1;
			}
			else if ( (LA2_0==23) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:19:12: print
					{
					pushFollow(FOLLOW_print_in_statement40);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:20:5: println
					{
					pushFollow(FOLLOW_println_in_statement46);
					println();
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:22:1: print : ( 'PRINT' STRING | 'PRINT' expr );
	public final void print() throws RecognitionException {
		Token STRING1=null;
		int expr2 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:22:7: ( 'PRINT' STRING | 'PRINT' expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==22) ) {
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
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:22:9: 'PRINT' STRING
					{
					match(input,22,FOLLOW_22_in_print54); 
					STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print56); 
					System.out.print((STRING1!=null?STRING1.getText():null).replaceAll("^\"|\"$", ""));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:23:4: 'PRINT' expr
					{
					match(input,22,FOLLOW_22_in_print63); 
					pushFollow(FOLLOW_expr_in_print65);
					expr2=expr();
					state._fsp--;

					System.out.print(expr2);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:25:1: println : ( 'PRINTLN' STRING | 'PRINTLN' expr );
	public final void println() throws RecognitionException {
		Token STRING3=null;
		int expr4 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:25:9: ( 'PRINTLN' STRING | 'PRINTLN' expr )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==23) ) {
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
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:25:11: 'PRINTLN' STRING
					{
					match(input,23,FOLLOW_23_in_println76); 
					STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_println78); 
					System.out.println((STRING3!=null?STRING3.getText():null).replaceAll("^\"|\"$", ""));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:26:4: 'PRINTLN' expr
					{
					match(input,23,FOLLOW_23_in_println85); 
					pushFollow(FOLLOW_expr_in_println87);
					expr4=expr();
					state._fsp--;

					System.out.println(expr4);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:31:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:33:3: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:33:3: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr108);
			e=multExpr();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:35:3: ( '+' e= multExpr | '-' e= multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19) ) {
					alt5=1;
				}
				else if ( (LA5_0==20) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:35:3: '+' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr115); 
					pushFollow(FOLLOW_multExpr_in_expr119);
					e=multExpr();
					state._fsp--;

					value += e; 
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:37:3: '-' e= multExpr
					{
					match(input,20,FOLLOW_20_in_expr126); 
					pushFollow(FOLLOW_multExpr_in_expr130);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:44:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:46:3: (e= atom ( '*' e= atom | '/' e= atom )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:46:3: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr154);
			e=atom();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:46:31: ( '*' e= atom | '/' e= atom )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==18) ) {
					alt6=1;
				}
				else if ( (LA6_0==21) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:46:32: '*' e= atom
					{
					match(input,18,FOLLOW_18_in_multExpr159); 
					pushFollow(FOLLOW_atom_in_multExpr163);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:47:4: '/' e= atom
					{
					match(input,21,FOLLOW_21_in_multExpr170); 
					pushFollow(FOLLOW_atom_in_multExpr174);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:53:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT5=null;
		Token ID6=null;
		int expr7 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:55:3: ( INT | ID | '(' expr ')' )
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
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:55:3: INT
					{
					INT5=(Token)match(input,INT,FOLLOW_INT_in_atom195); 
					value = Integer.parseInt((INT5!=null?INT5.getText():null));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:57:3: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_atom202); 


					Integer v = (Integer)memory.get((ID6!=null?ID6.getText():null));

					if ( v!=null ) value = v.intValue();

					else System.err.println("undefined variable "+(ID6!=null?ID6.getText():null));


					}
					break;
				case 3 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\grammerLab5.g:69:3: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom210); 
					pushFollow(FOLLOW_expr_in_atom212);
					expr7=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom214); 
					value = expr7;
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

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program31 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_print_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_print54 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_print56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_print63 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_print65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_println76 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_println78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_println85 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_println87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr108 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_19_in_expr115 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr119 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_20_in_expr126 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_multExpr_in_expr130 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_atom_in_multExpr154 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_18_in_multExpr159 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr163 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_21_in_multExpr170 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_atom_in_multExpr174 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_INT_in_atom195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom210 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_atom212 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom214 = new BitSet(new long[]{0x0000000000000002L});
}
