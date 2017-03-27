package ScreenFactory;

/**
 * Created by IntelliJ IDEA.
 * User: zaferguler
 * Date: 09.Mar.2010
 * Time: 14:56:17
 * To change this template use File | Settings | File Templates.
 */
public class WindowsScreenCreator extends creator2{
    @Override
    public Screen ScreenFactory() {
        return new WindowsScreen();
    }
}
