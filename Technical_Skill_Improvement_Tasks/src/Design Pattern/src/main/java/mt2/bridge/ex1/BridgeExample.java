package mt2.bridge.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: Zeybek
 * Date: 18.Nis.2010
 * Time: 17:21:32
 * To change this template use File | Settings | File Templates.
 */
public class BridgeExample {
    public static void main(String[] args)
    {
        Shape[] shapes=new Shape[2];
        shapes[0] = new Circle(1, 2, 3, new DrawingAPI1());
        shapes[1] = new Circle(5, 7, 11, new DrawingAPI2());
        for (Shape shape : shapes) {
        shape.resizeByPercentage(2.5);
        shape.draw();
}
    }
}
