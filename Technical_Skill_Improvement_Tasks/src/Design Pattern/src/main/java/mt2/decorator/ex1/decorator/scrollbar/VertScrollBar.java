package mt2.decorator.ex1.decorator.scrollbar;


import mt2.decorator.ex1.Component;
import mt2.decorator.ex1.decorator.Decorator;

public class VertScrollBar extends Decorator {

    public VertScrollBar(Component c) {
        super(c);
    }

    public void draw(){
        super.draw();
        vertScroll();
    }

    public void vertScroll(){
        System.out.print(" with vertical scroll bar");
    }
}
