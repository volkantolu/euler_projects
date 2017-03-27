package Reverse.Polish.Notation;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:34:43
 * To change this template use File | Settings | File Templates.
 */
public class InterpreterExample {
    public static void main(String[] args) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        HashMap<String,Integer> variables = new HashMap<String,Integer>();
        variables.put("w", 5);
        variables.put("x", 10);
        variables.put("z", 42);
        int result = sentence.evaluate(variables);
        System.out.println("Result is = "+result);
    }
}