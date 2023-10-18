import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;

public class App {
    public static void main(String[] args) throws Exception {

        String texto = "a = 1;";
        Lexico lex = new Lexico(texto);
        Sintatico sin = new Sintatico();
        Semantico sem = new Semantico();
        try {
            sin.parse(lex, sem);
            System.out.println("deu bom");
        } catch (LexicalError | SemanticError |SyntaticError ex) {
            System.out.println("deu ruim");
            
        } 
    }
}
