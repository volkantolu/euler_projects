package mt2.decorator.ex1.decorator.border;

import mt2.decorator.ex1.Component;
import mt2.decorator.ex1.decorator.Decorator;

public class _3DBorder extends Decorator {

    public _3DBorder(Component c) {
        super(c);
    }

    public void draw(){
        super.draw();
        _3DBorder();
    }

    public void _3DBorder(){
        System.out.print(" with 3D border");
    }
}
