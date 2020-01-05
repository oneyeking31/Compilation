/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilation;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author dell
 */
public class Compilation {

    /**
     * @param args the command line arguments
     */
   
    public static final String entier="\\-?[0-9]+";
    public static final String reel="\\-?[0-9]+";
    public static final String id="[a-zA-Z](_?([a-zA-Z0-9])+)*";
    
    
    public static void main(String[] args) {
        
        
        Matcher matcher;
        
        String test = "1";
        Pattern pattern = Pattern.compile("2a");
        matcher = pattern.matcher(entier);
        
        if(Pattern.matches(reel, test))System.out.println("Trouvée !!!!!");
        else System.out.println("Noooooooooooooooooo !!!");
        
        /*---------------------------------------------------------------------------------*/
        
        AnalyseurLexicale analyseur=new AnalyseurLexicale("C:\\Users\\dell\\Desktop\\IA\\Compilation_Test.txt");
        while (!analyseur.isExausthed()) {
            System.out.printf("%-18s :  %s \n",analyseur.currentLexema() , analyseur.currentToken());
            analyseur.moveAhead();
        }

        if (analyseur.isSuccessful()) {
            System.out.println("Ok! :D");
        } else {
            System.out.println(analyseur.errorMessage());
        }
        
        
        
        
        
        
    }
    
}
