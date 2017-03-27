package pattern.decorator.border;

import pattern.decorator.Decorator;
import pattern.Component;


public class _3DBorder extends Decorator{

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
