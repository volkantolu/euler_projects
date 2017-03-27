package mt1.factory.ex1;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 09.Mar.2010
 * Time: 14:56:50
 * To change this template use File | Settings | File Templates.
 */
public class MobileScreenCreator extends creator2{

    @Override
    public Screen ScreenFactory() {
        return new MobileScreen();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
