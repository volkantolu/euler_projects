package pattern.decorator.border;


import pattern.decorator.Decorator;
import pattern.Component;


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
