/**
 * Created by IntelliJ IDEA.
 * User: aydin
 * Date: 29.Mar.2010
 * Time: 17:38:38
 * To change this template use File | Settings | File Templates.
 */

package mt2.facade.ex1;

class Line {
    private Point o, e;

    public Line(Point ori, Point end) {
        o = ori;
        e = end;
    }

    public void move(int dx, int dy) {
        o.move(dx, dy);
        e.move(dx, dy);
    }

    public void rotate(int angle) {
        e.rotate(angle, o);
    }

    public String toString() {
        return "origin is " + o + ", end is " + e;
    }
}
