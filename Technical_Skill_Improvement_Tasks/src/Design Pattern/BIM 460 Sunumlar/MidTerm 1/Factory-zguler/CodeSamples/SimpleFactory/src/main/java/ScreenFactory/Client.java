package ScreenFactory;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 09.Mar.2010
 * Time: 14:51:11
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        creator1 c1 = new creator1();

        Screen s = c1.ScreenFactor(ScreenModel.mobile);
        s.draw();

        System.out.println("--------------------------------------------");

        creator2[]  c2 = {
                new MobileScreenCreator(),
                new WindowsScreenCreator()
        };

        for(creator2 c : c2){
            Screen s1 = c.ScreenFactory();
            s1.draw();
        }
    }
}
