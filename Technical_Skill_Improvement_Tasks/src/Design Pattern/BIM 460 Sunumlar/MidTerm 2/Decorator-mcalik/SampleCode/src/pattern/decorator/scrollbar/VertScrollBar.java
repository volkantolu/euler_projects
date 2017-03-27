package pattern.decorator.scrollbar;


import pattern.decorator.Decorator;
import pattern.Component;

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
