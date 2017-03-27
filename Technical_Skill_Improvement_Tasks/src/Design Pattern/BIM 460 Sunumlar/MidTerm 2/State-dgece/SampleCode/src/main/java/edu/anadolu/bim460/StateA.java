package edu.anadolu.bim460;

/**
 * Created by IntelliJ IDEA.
 * User: derya
 * Date: 04.Nis.2010
 * Time: 22:25:50
 * To change this template use File | Settings | File Templates.
 */

//ConcreteState subclasses: Define the behavior associated with stateA.

public class StateA implements State{
    
    public void writeName(StateContext stateContext, String name) {
        //prints coming name in lowercase and set the state
        // as StateB with stateContext object
           System.out.println(name.toLowerCase());
           stateContext.setState(new StateB());
       }

}
