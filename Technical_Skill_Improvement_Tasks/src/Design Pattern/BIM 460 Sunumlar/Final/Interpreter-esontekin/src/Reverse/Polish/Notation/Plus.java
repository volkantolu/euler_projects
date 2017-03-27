package Reverse.Polish.Notation;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:33:15
 * To change this template use File | Settings | File Templates.
 */
class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public Plus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(HashMap<String,Integer> variables)  {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
