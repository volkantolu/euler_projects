/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:19:44
 * To change this template use File | Settings | File Templates.
 */
public interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
