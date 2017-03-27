/**
 * Created by IntelliJ IDEA.
 * User: aydin
 * Date: 29.Mar.2010
 * Time: 17:39:30
 * To change this template use File | Settings | File Templates.
 */
// 1. Subsystem

package mt2.facade.ex1;

class PointPolar {
    private double radius, angle;

    public PointPolar(double r, double a) {
        radius = r;
        angle = a;
    }

    public void rotate(int ang) {
        angle += ang % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
