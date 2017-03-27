package mt2.decorator.ex1.decorator.border;


import mt2.decorator.ex1.Component;
import mt2.decorator.ex1.decorator.Decorator;

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
