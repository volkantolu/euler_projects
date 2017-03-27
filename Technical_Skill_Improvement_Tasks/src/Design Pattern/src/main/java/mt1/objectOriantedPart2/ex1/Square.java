package mt1.objectOriantedPart2.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: Huseyin
 * Date: 02.Mar.2010
 * Time: 14:55:35
 * To change this template use File | Settings | File Templates.
 */
public class Square  extends Rectangle
{

    public Square(double s)  {super(s, s);}
    public void setWidth(int w)
    {
        super.setWidth(w);
        super.setHeight(w);
    }
    public void setHeight(int h)
    {
        super.setHeight(h);
        super.setWidth(h);         
        
    }

    
}
