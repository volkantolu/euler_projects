/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:21:15
 * To change this template use File | Settings | File Templates.
 */
public class Body implements CarElement{
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
