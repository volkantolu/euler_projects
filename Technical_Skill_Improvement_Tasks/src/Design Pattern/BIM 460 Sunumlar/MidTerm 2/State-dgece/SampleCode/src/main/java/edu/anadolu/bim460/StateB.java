package edu.anadolu.bim460;

/**
 * Created by IntelliJ IDEA.
 * User: derya
 * Date: 04.Nis.2010
 * Time: 22:26:37
 * To change this template use File | Settings | File Templates.
 */

//Concrete State subclasses: Define the behavior associated with stateB.

class StateB implements State {
   //prints coming name in uppercase and set the state as
   // StateA with stateContext object
	public void writeName(StateContext stateContext, String name){
		System.out.println(name.toUpperCase());
        stateContext.setState(new StateA());
		
	}
}

