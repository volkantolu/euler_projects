package Reverse.Polish.Notation;

import java.util.HashMap;
/**
 * Created by IntelliJ IDEA.
 * User: emru
 * Date: 11.May.2010
 * Time: 08:29:42
 * To change this template use File | Settings | File Templates.
 */
interface Expression {
     public int interpret(HashMap<String,Integer> variables);
}
