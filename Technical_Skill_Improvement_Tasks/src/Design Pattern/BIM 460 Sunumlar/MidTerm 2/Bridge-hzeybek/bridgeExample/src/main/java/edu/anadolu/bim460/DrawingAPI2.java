package edu.anadolu.bim460;

/**
 * Created by IntelliJ IDEA.
 * User: Zeybek
 * Date: 18.Nis.2010
 * Time: 17:15:53
 * To change this template use File | Settings | File Templates.
 */
public class DrawingAPI2 implements DrawingAPI{
    public void drawCircle(double x, double y, double r) {
      System.out.printf("API1.circle at %f:%f radius %f\n", x, y,r);
    }
}
