package gals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Semantico implements Constants {
    private Map<String, Integer> variables = new HashMap<String, Integer>();
    private String currentVariable;
    private String currenOperation;

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        switch (action) {
            // variable atribution
            case 1: {
                variables.put(token.getLexeme(), null);
                this.currentVariable = token.getLexeme();
                break;
            }
            // case token is another variable
            case 4: {
                int tokenValue = variables.get(token.getLexeme());
                variables.replace(token.getLexeme(), tokenValue);
                break;
            }
            //case token is a value
            case 5: {
                int tokenValue = Integer.parseInt(token.getLexeme());
                variables.replace(this.currentVariable, tokenValue);
                break;
            }
            case 10: {
                this.currenOperation = token.getLexeme();
                ;
                break;
            }
        }

        System.out.println(variables.toString());
    }
}
