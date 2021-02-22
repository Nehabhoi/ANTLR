// $ANTLR 3.5.1 C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g 2021-02-21 19:43:18
 package lab4;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammerLab4Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
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


	public grammerLab4Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammerLab4Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return grammerLab4Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g"; }



	// $ANTLR start "program"
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:5:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:5:9: ( ( statement )+ )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:5:11: ( statement )+
			{
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:5:11: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 16 && LA1_0 <= 17)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:5:11: statement
					{
					pushFollow(FOLLOW_statement_in_program22);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:7:1: statement : ( print | println );
	public final void statement() throws RecognitionException {
		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:7:11: ( print | println )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==16) ) {
				alt2=1;
			}
			else if ( (LA2_0==17) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:7:12: print
					{
					pushFollow(FOLLOW_print_in_statement30);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:8:5: println
					{
					pushFollow(FOLLOW_println_in_statement36);
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:10:1: print : 'PRINT' STRING ;
	public final void print() throws RecognitionException {
		Token STRING1=null;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:10:7: ( 'PRINT' STRING )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:10:9: 'PRINT' STRING
			{
			match(input,16,FOLLOW_16_in_print44); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print46); 
			System.out.print((STRING1!=null?STRING1.getText():null));
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
	// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:11:1: println : 'PRINTLN' STRING ;
	public final void println() throws RecognitionException {
		Token STRING2=null;

		try {
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:11:9: ( 'PRINTLN' STRING )
			// C:\\Master in CS\\sem1\\APL\\Lab\\APL-Lab\\lab4\\grammerLab4.g:11:11: 'PRINTLN' STRING
			{
			match(input,17,FOLLOW_17_in_println56); 
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_println58); 
			System.out.println((STRING2!=null?STRING2.getText():null));
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

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program22 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_print_in_statement30 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement36 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_print44 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_print46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_println56 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_println58 = new BitSet(new long[]{0x0000000000000002L});
}
