/**
 * Created by IntelliJ IDEA.
 * User: Huseyin
 * Date: 02.Mar.2010
 * Time: 00:51:49
 * To change this template use File | Settings | File Templates.
 */
public class GraphicEditorGood
{
    public void drawShape(ShapeGood s)
    {
      s.draw();
    }

    public static void main(String [] args)
    {
      GraphicEditorGood g = new GraphicEditorGood();
      ShapeGood c = new CircleGood();
      ShapeGood r = new RectangleGood();

      g.drawShape(c);
      g.drawShape(r);
    }
}

