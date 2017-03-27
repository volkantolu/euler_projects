package pattern.decorator.border;


import pattern.decorator.Decorator;
import pattern.Component;


public class PlainBorder extends Decorator {

    public PlainBorder(Component vc) {
        super(vc);
    }

    public void draw(){
        super.draw();
        plainBorder();
    }

    public void plainBorder(){
        System.out.print(" with plain border");
    }
}
