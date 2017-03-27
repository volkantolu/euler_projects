package mt2.composite.ex2;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 02.May.2010
 * Time: 23:21:07
 * To change this template use File | Settings | File Templates.
 */

import java.util.List;
import java.util.ArrayList;

/**
 * "Component"
 */
interface Graphic {

    //Prints the graphic.

    public void print();
}

/**
 * "Composite"
 */
class CompositeGraphic implements Graphic {

    //Collection of child graphics.
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    //Prints the graphic.

    public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    //Adds the graphic to the composition.

    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    //Removes the graphic from the composition.

    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }
}

/**
 * "Leaf"
 */
class Ellipse implements Graphic {

    //Prints the graphic.

    public void print() {
        System.out.println("Ellipse");
    }
}

/**
 * "Leaf"
 */
class Circle implements Graphic{

    public void print() {
        System.out.println("Circle");
    }
}

/**
 * Client
 */
public class Program {

    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
        graphic1.add(circle1);

        graphic2.add(ellipse4);
        graphic2.add(circle2);
        graphic2.add(circle3);

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(circle4);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
    }
}
