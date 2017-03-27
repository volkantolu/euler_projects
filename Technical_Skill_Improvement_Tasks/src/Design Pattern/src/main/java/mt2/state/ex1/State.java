
package mt2.state.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: derya
 * Date: 04.Nis.2010
 * Time: 22:24:41
 * To change this template use File | Settings | File Templates.
 */

//State: An interface for encapsulating the behavior
// associated with a particular state of the Context.

public interface State {
    //takes context object and name as arguments
    public void writeName(StateContext stateContext, String name);
    
}
