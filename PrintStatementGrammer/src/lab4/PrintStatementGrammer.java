/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
/**
 *
 * @author bhoin
 */
public class PrintStatementGrammer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, RecognitionException{
        // TODO code application logic here
    grammerLab4Lexer lexer = new grammerLab4Lexer(new ANTLRFileStream(args[0]));

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    grammerLab4Parser parser = new grammerLab4Parser(tokens);

    parser.program();
    }
    
}
