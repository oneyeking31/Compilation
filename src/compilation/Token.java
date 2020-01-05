/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public enum Token {
    
    Commenntaire ("//\\.(.*)"),
    TK_Debut ("Start_Program"),
    TK_FIN ("End_Program"),
    TK_CONDITION("--"),
    TK_DECL("Int_Number"),
    TK_DECl(":"),
    TK_SOUS ("-"), 
    TK_PLUS ("\\+"), 
    TK_MUL ("\\*"), 
    TK_DIV ("/"), 
    TK_AND ("&"),  
    TK_OR ("\\|"),  
    TK_LESS ("<"),
    TK_LEG ("<="),
    TK_GT (">"),
    TK_GEQ (">="), 
    TK_EQ ("=="),
    TK_ASSIGN ("Give"),
    TK_OPEN ("\\("),
    TK_CLOSE ("\\)"), 
    FinLigne (";;"), 
    TK_VIRG (","), 
    TK_KEY_DEFINE ("define"),
    TK_KEY_IS ("is"),
    TK_KEY_IF ("if"), 
    TK_KEY_THEN ("then"), 
    TK_KEY_ELSE ("else"), 
    TK_KEY_ENDIF ("endif"),
    TK_START ("Start"),
    TK_END ("Finish"),
    DIFFERENT ("<>"),

    STRING ("\"[^\"]+\""),
    REEL ("\\-?([0-9]+)\\.([0-9]+)"),
    INTIGER ("[0-9]+"), 
    IDENTIFIER ("[a-zA-Z](_?([a-zA-Z0-9])+)*");
    

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}

