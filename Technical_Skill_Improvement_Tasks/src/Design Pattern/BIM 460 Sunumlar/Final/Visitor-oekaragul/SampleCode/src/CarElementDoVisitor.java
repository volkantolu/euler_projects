/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:22:14
 * To change this template use File | Settings | File Templates.
 */
public class CarElementDoVisitor implements CarElementVisitor{
    public void visit(Wheel wheel) {
        System.out.println("Kicking my "+ wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}
