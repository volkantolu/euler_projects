package mt2.decorator.ex1.decorator.scrollbar;

import mt2.decorator.ex1.Component;
import mt2.decorator.ex1.decorator.Decorator;

public class HorzScrollBar extends Decorator {

    public HorzScrollBar(Component c){
        super(c);
    }

    public void draw(){
        super.draw();
        horzScroll();
    }

    public void horzScroll(){
        System.out.print(" with horizental scroll bar");
    }

}
