<br />
<p align="center">
 <h3 align="center">ANTLR : Another Tool for Language Recognition</h3>

 </p>

### Description
ANTLR inputs a .g grammar file, preprocesses it and analyzes the grammar. 
If the grammar is okay ANTLR generates three files (classes actually)
    1. A token list called “grammar_name.tokens” </br>
    2. A parser file class called “grammar_nameParse.Java” </br>
    3. A lexer file class called “grammar_nameLexer.Java” </br>

### Steps
1. Process the file Expr.g in ANTLR. ANTLR produces three files: a lexer, a parser and tokens file (AntlrWorks_Image.PNG) </br>
    a. You will have to set output path while generating the code in AntlrWorks (file->preferences->oputput path) => Antlr_Set_output_Path.PNG </br>
    b. The output path will be the src\package folder of your java project </br>
    c. To generate three files (generate -> generate code) => Antlr_generated_files.PNG </br>
2. In Netbeans create a Java project. Include the three file ANTLR produced in the project.  (refer grammerFirst folder)
3. ANTLR has a runtime library that must be added to the project (In Netbeans, expand the Libraries branch of the project tree, then right click Libraries and selection Add jar, then navigate to the antlr-3.3-complete location and select it.)
4. At top,</br>
import java.io.IOException; </br>
import org.antlr.runtime.ANTLRFileStream;</br>
import org.antlr.runtime.CommonTokenStream;</br>
import org.antlr.runtime.RecognitionException;</br>

5. In your Netbeans main place code similar to this:

ExprLexer lexer = new ExprLexer(new ANTLRFileStream(args[0]));</br>
CommonTokenStream tokens = new CommonTokenStream(lexer);</br>
ExprParser parser = new ExprParser(tokens);</br>
parser.prog();</br>

6. Add "input.e" file to java project and set argument (right click on project -> set configuration -> custome -> Run -> Arguments) => Set_Input_Netbeans.PNG

7. Run the java project => Run.PNG


### Software required:
1. ANTLRWork
2. Netbeans
3. Antlr jar