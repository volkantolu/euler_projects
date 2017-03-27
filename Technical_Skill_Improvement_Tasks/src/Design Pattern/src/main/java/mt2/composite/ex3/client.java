package mt2.composite.ex3;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 02.May.2010
 * Time: 23:55:57
 * To change this template use File | Settings | File Templates.
 */
public class client {
    public static void main(String args[]){
        Line line = new Line();
        Text text = new Text();
        Picture picture = new Picture();

        Line linep = new Line();
        Text textp = new Text();
        Picture p1 = new Picture();

        Text t = new Text();
        p1.add(t);

        picture.add(linep);
        picture.add(textp);
        picture.add(p1);

        Component com = new Component();
        com.add(picture);

        com.draw();
    }
}
