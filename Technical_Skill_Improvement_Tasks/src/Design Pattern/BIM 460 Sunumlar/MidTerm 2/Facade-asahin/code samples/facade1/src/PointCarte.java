/**
 * Created by IntelliJ IDEA.
 * User: aydin
 * Date: 29.Mar.2010
 * Time: 17:39:56
 * To change this template use File | Settings | File Templates.
 */
// 1. Subsystem
class PointCarte {
  private double x, y;
  public PointCarte( double xx, double yy ) {
    x = xx;
    y = yy;
  }
  public void  move( int dx, int dy ) {
    x += dx;
    y += dy;
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
}

