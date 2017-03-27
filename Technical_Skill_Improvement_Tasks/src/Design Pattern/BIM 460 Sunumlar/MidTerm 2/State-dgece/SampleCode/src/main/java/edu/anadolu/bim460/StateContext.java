package edu.anadolu.bim460;

/**
 * Created by IntelliJ IDEA.
 * User: derya
 * Date: 04.Nis.2010
 * Time: 22:25:18
 * To change this template use File | Settings | File Templates.
 */

//Context:passes itself as an argument to the current state object,
//  which changes the current state of the context.
public class StateContext {
    private State myState;
    
        public StateContext() {
            setState(new StateA());
        }

            // normally only called by classes implementing the State interface
        public void setState(State newState) {
            this.myState = newState;
        }

        public void writeName(String name) {
            this.myState.writeName(this, name);
        }

}
