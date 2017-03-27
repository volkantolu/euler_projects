package pattern.decorator;

import pattern.Component;
public class Decorator extends Component {

    private Component component;

    public Decorator(Component c){
        component=c;
    }

    public void draw() {
        component.draw();
    }

}
