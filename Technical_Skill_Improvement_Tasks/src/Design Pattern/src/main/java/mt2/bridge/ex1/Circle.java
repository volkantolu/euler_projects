package mt2.bridge.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: Zeybek
 * Date: 18.Nis.2010
 * Time: 17:11:04
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape{
    private double x,y,r;
    private DrawingAPI drawingAPI;

    public Circle(double x,double y,double r,DrawingAPI drawingAPI)
    {
        this.x=x;
        this.y=y;
        this.r=r;
        this.drawingAPI=drawingAPI;

    }


    public void draw() {
        drawingAPI.drawCircle(x,y,r);
       
    }

    public void resizeByPercentage(double pct) {
        r *= pct;

    }
}
