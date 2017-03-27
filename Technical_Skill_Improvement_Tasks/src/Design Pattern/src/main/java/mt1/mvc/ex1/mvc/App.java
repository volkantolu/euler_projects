package mt1.mvc.ex1.mvc;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 19.Sub.2010
 * Time: 20:36:33
 */
public class App {

    public static void main(String[] args) {
        Car car = new Car(0, "My Car");
        ViewWindow viewWindow = new ViewWindow(car);
        viewWindow.setVisible(true);
        new ControllerWindow(viewWindow, car).setVisible(true);


    }


}
