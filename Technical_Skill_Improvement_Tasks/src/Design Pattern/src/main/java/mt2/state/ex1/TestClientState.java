package mt2.state.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: derya
 * Date: 04.Nis.2010
 * Time: 22:27:14
 * To change this template use File | Settings | File Templates.
 */
public class TestClientState {
    public static void main(String[] args) {
            StateContext sc = new StateContext();
            sc.writeName("Monday");
            sc.writeName("Tuesday");
            sc.writeName("Wednesday");
            sc.writeName("thursday");
            sc.writeName("Friday");
            sc.writeName("Saturday");
            sc.writeName("sunday");
        }
    
}
