/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:20:48
 * To change this template use File | Settings | File Templates.
 */
public class Engine implements  CarElement{
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
