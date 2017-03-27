package mt2.bridge.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: Zeybek
 * Date: 18.Nis.2010
 * Time: 17:15:42
 * To change this template use File | Settings | File Templates.
 */
public class DrawingAPI1  implements DrawingAPI{
    public void drawCircle(double x, double y, double r) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y,r);
    }
}
