package mt2.decorator.ex1.decorator;

import mt2.decorator.ex1.Component;

public class Decorator extends Component {

    private Component component;

    public Decorator(Component c){
        component=c;
    }

    public void draw() {
        component.draw();
    }

}
