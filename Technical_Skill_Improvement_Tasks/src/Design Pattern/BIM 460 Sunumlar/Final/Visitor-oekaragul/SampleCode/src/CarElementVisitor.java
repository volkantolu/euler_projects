/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:18:06
 * To change this template use File | Settings | File Templates.
 */
public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
