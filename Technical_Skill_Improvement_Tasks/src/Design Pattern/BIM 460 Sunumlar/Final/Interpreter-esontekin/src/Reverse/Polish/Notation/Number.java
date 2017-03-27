package Reverse.Polish.Notation;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:32:50
 * To change this template use File | Settings | File Templates.
 */
class Number implements Expression {
    private int number;
    public Number(int number)       { this.number = number; }
    public int interpret(HashMap<String,Integer> variables)  { return number; }
}