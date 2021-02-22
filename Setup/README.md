<br />
<p align="center">
 <h3 align="center">ANTLR : Another Tool for Language Recognition</h3>

 </p>

### Description
ANTLR inputs a .g grammar file, preprocesses it and analyzes the grammar. 
If the grammar is okay ANTLR generates three files (classes actually)
    1. A token list called “grammar_name.tokens”
    2. A parser file class called “grammar_nameParse.Java”
    3. A lexer file class called “grammar_nameLexer.Java”

### Steps
1. Process the file Expr.g in ANTLR. ANTLR produces three files: a lexer, a parser and tokens file (AntlrWorks_Image.PNG)
    a. You will have to set output path while generating the code in AntlrWorks (file->preferences->oputput path) => Antlr_Set_output_Path.PNG
    b. The output path will be the src\package folder of your java project 
    c. To generate three files (generate -> generate code) => Antlr_generated_files.PNG
2. In Netbeans create a Java project. Include the three file ANTLR produced in the project.  (refer grammerFirst folder)
3. ANTLR has a runtime library that must be added to the project (In Netbeans, expand the Libraries branch of the project tree, then right click Libraries and selection Add jar, then navigate to the antlr-3.3-complete location and select it.)
4. At top,
import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

5. In your Netbeans main place code similar to this:

ExprLexer lexer = new ExprLexer(new ANTLRFileStream(args[0]));
CommonTokenStream tokens = new CommonTokenStream(lexer);
ExprParser parser = new ExprParser(tokens);
parser.prog();

6. Add "input.e" file to java project and set argument (right click on project -> set configuration -> custome -> Run -> Arguments) => Set_Input_Netbeans.PNG

7. Run the java project => Run.PNG


### Software required:
1. ANTLRWork
2. Netbeans
3. Antlr jar