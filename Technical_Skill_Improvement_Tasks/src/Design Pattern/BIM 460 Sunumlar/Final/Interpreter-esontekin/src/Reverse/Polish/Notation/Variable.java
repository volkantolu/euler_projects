package Reverse.Polish.Notation;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:34:08
 * To change this template use File | Settings | File Templates.
 */
class Variable implements Expression {
    private String name;
    public Variable(String name)       { this.name = name; }
    public int interpret(HashMap<String,Integer> variables)  {
        return variables.get(name);
    }
}