package pattern;

import pattern.decorator.border.*;
import pattern.decorator.scrollbar.*;


public class Client {
    public static void main(String[] args) {
        TextView text=new TextView();
        text.draw();
        System.out.println("");

        Component border=new _3DBorder(text);
        border.draw();
        System.out.println("");

        Component scroll=new VertScrollBar(text);
        scroll.draw();
        System.out.println("");

        Component borderAndScroll=new FancyBorder(scroll);
        borderAndScroll.draw();


       
    }
}
