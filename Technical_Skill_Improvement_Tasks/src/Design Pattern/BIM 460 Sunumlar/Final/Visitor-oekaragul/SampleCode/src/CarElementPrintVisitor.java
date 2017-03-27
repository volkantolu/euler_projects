/**
 * Created by IntelliJ IDEA.
 * User: Emre
 * Date: 08.May.2010
 * Time: 18:21:56
 * To change this template use File | Settings | File Templates.
 */
public class CarElementPrintVisitor implements CarElementVisitor{
    public void visit(Wheel wheel) {
        System.out.println("Visiting "+ wheel.getName()
                            + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}
