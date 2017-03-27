package mt2.composite.ex3;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 02.May.2010
 * Time: 23:26:53
 * To change this template use File | Settings | File Templates.
 */
public class Picture implements Graphic {

    private ArrayList<Graphic> list = new ArrayList<Graphic>();

    public void add(Graphic graphic) {
        list.add(graphic);
    }

    public void remove(Graphic graphic) {
        list.remove(graphic);
    }

    public void draw() {
        //Iterator it = list.iterator();
        for (Graphic g : list) {
            Object o = g;
            //System.out.println("Picture");
            ((Graphic) o).draw();
        }
    }

}
