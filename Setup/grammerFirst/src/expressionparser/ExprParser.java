// $ANTLR 3.5.1 C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g 2021-02-21 18:53:43


package expressionparser;

import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g"; }



	/** Map variable name to Integer object holding value */

	HashMap memory = new HashMap();




	// $ANTLR start "prog"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:28:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:28:5: ( ( stat )+ )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:28:7: ( stat )+
			{
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:28:7: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:28:7: stat
					{
					pushFollow(FOLLOW_stat_in_prog33);
					stat();
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
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:30:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
	public final void stat() throws RecognitionException {
		Token ID2=null;
		int expr1 =0;
		int expr3 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:30:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
			case 8:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==13) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:30:7: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat42);
					expr1=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat44); 
					System.out.println(expr1);
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:32:3: ID '=' expr NEWLINE
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_stat51); 
					match(input,13,FOLLOW_13_in_stat53); 
					pushFollow(FOLLOW_expr_in_stat55);
					expr3=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat57); 
					memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));
					}
					break;
				case 3 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:36:3: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat65); 
					System.out.println("A newline has been issued");
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
	// $ANTLR end "stat"



	// $ANTLR start "expr"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:41:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:43:3: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:43:3: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr85);
			e=multExpr();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:45:3: ( '+' e= multExpr | '-' e= multExpr )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==11) ) {
					alt3=1;
				}
				else if ( (LA3_0==12) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:45:3: '+' e= multExpr
					{
					match(input,11,FOLLOW_11_in_expr92); 
					pushFollow(FOLLOW_multExpr_in_expr96);
					e=multExpr();
					state._fsp--;

					value += e; 
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:47:3: '-' e= multExpr
					{
					match(input,12,FOLLOW_12_in_expr103); 
					pushFollow(FOLLOW_multExpr_in_expr107);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop3;
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:54:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:56:3: (e= atom ( '*' e= atom )* )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:56:3: e= atom ( '*' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr131);
			e=atom();
			state._fsp--;

			value = e;
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:56:31: ( '*' e= atom )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==10) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:56:32: '*' e= atom
					{
					match(input,10,FOLLOW_10_in_multExpr136); 
					pushFollow(FOLLOW_atom_in_multExpr140);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;

				default :
					break loop4;
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:61:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT4=null;
		Token ID5=null;
		int expr6 =0;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:63:3: ( INT | ID | '(' expr ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case 8:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:63:3: INT
					{
					INT4=(Token)match(input,INT,FOLLOW_INT_in_atom160); 
					value = Integer.parseInt((INT4!=null?INT4.getText():null));
					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:65:3: ID
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_atom167); 


					Integer v = (Integer)memory.get((ID5!=null?ID5.getText():null));

					if ( v!=null ) value = v.intValue();

					else System.err.println("undefined variable "+(ID5!=null?ID5.getText():null));


					}
					break;
				case 3 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab3\\Expr.g:77:3: '(' expr ')'
					{
					match(input,8,FOLLOW_8_in_atom175); 
					pushFollow(FOLLOW_expr_in_atom177);
					expr6=expr();
					state._fsp--;

					match(input,9,FOLLOW_9_in_atom179); 
					value = expr6;
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



	public static final BitSet FOLLOW_stat_in_prog33 = new BitSet(new long[]{0x0000000000000172L});
	public static final BitSet FOLLOW_expr_in_stat42 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat51 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat53 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_stat55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr85 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_expr92 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_multExpr_in_expr96 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_expr103 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_multExpr_in_expr107 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_atom_in_multExpr131 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_multExpr136 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_atom_in_multExpr140 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INT_in_atom160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_atom175 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_atom177 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_atom179 = new BitSet(new long[]{0x0000000000000002L});
}
