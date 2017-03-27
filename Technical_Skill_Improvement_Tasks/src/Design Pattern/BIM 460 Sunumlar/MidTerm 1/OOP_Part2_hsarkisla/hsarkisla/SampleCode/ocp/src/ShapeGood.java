/**
 * Created by IntelliJ IDEA.
 * User: Huseyin
 * Date: 02.Mar.2010
 * Time: 00:56:18
 * To change this template use File | Settings | File Templates.
 */
abstract  class ShapeGood
{
  int mType;
  abstract void draw();
}

class RectangleGood extends ShapeGood
{
   RectangleGood()
    {
     super.mType=1;
    }
    public void draw()
    {
        System.out.println("This rectangle good 4 OCP");
    }
}

class CircleGood extends ShapeGood
{
    CircleGood()
    {
       super.mType=2;
    }
    public void draw()
    {
        System.out.println("This circle  good 4 OCP");
    }
}
