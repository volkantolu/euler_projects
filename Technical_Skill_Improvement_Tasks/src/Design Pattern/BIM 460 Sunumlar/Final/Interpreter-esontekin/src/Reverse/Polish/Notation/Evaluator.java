package Reverse.Polish.Notation;


import java.util.Stack;
import java.util.HashMap;
/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:27:13
 * To change this template use File | Settings | File Templates.
 */
public class Evaluator {

    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();
        for (String token : expression.split(" ")) {
            if  (token.equals("+")) {
                Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push( subExpression );
            }
            else if (token.equals("-")) {
                Expression subExpression = new Minus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push( subExpression );
            }
            else
                expressionStack.push( new Variable(token) );
        }
        syntaxTree = expressionStack.pop();
    }

    public int evaluate(HashMap<String,Integer> context) {
        return syntaxTree.interpret(context);
    }
}
