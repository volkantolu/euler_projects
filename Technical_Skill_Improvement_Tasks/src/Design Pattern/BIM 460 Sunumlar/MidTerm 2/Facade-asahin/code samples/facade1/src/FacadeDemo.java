/**
 * Created by IntelliJ IDEA.
 * User: aydin
 * Date: 29.Mar.2010
 * Time: 17:38:08
 * To change this template use File | Settings | File Templates.
 */
class FacadeDemo {
  public static void main( String[] args ) {
    // 3. Client uses the Facade
    Line line1 = new Line( new Point(2,4), new Point(5,7) );
    line1.move(-2,-4);
    System.out.println( "after move:  " + line1 );
    line1.rotate(45);
    System.out.println( "after rotate: " + line1 );

      

  }
}
