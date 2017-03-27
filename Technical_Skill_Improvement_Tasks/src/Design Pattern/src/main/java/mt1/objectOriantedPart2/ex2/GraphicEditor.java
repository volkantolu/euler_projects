package mt1.objectOriantedPart2.ex2;

/**
 * Created by IntelliJ IDEA.
 * User: Huseyin
 * Date: 02.Mar.2010
 * Time: 00:35:32
 * To change this template use File | Settings | File Templates.
 */
// Open-Close Principle - Bad example
public class GraphicEditor
{

   public void drawShape(Shape s)
    {
      if (s.mType==1)drawRectangle((Rectangle)s);
      else if (s.mType==2)drawCircle((Circle)s);
      else if ( s.mType == 3) drawTriangle((Triangle)s);
    }
   public void drawCircle(Circle r)
    {
       System.out.println("Circle class is called!(Not GOOD 4 OCP)");
    }
    public void drawRectangle(Rectangle r)
    {
       System.out.println("Rectangle class is called!(Not GOOD 4 OCP)");
    }
     public void drawTriangle(Triangle t)
    {
       System.out.println("Triangle class is called!(Not GOOD 4 OCP)");
    }
    public static void main(String [] args)
    {
      GraphicEditor g = new GraphicEditor();
      Shape c = new Circle();
      Shape r = new Rectangle();
      Shape t = new Triangle();

      g.drawCircle((Circle)c);
      g.drawRectangle((Rectangle)r);
      g.drawTriangle((Triangle) t);

    }
}
class Shape
{
  int mType;
}

class Rectangle extends Shape
{
   Rectangle()
    {
     super.mType=1;
    }
}

class Circle extends Shape
{
  Circle()
  {
    super.mType=2;
  }
}
class Triangle extends Shape
{
    Triangle()
    {
        super.mType = 3;
    }
}


