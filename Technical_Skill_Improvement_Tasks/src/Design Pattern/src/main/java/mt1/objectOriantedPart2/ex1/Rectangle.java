package mt1.objectOriantedPart2.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: Huseyin
 * Date: 02.Mar.2010
 * Time: 14:52:18
 * To change this template use File | Settings | File Templates.
 */
// Violation of Likov's Substitution Principle
class Rectangle
{
  protected int m_width;
  protected int m_height;

    public Rectangle(double s, double s1) {
    }

    public void setWidth(int width){m_width = width;}
  public void setHeight(int height){m_height = height;}
  public int getWidth(){return m_width;}
  public int getHeight(){return m_height;}
  public int getArea(){return m_width * m_height;}

}

