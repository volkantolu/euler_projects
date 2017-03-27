package mt2.decorator.ex1.decorator.border;

import mt2.decorator.ex1.Component;
import mt2.decorator.ex1.decorator.Decorator;


public class FancyBorder extends Decorator {

    public FancyBorder(Component c) {
        super(c);
    }

    public void draw(){
        super.draw();
        fancyBorder();
    }

    public void fancyBorder(){
        System.out.print(" with fancy border");
    }
}
