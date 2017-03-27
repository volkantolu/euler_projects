package pattern.decorator.scrollbar;


import pattern.decorator.Decorator;
import pattern.Component;

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
