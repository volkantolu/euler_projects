package ScreenFactory;



public class creator1 {
    public Screen ScreenFactor(ScreenModel type){
        Screen s = null;

        if(type.equals(ScreenModel.windows)){
            s = new WindowsScreen();
        } else if(type.equals(ScreenModel.web)){
            s = new WebScreen();
        } else if(type.equals(ScreenModel.mobile)){
            s = new MobileScreen();
        }
        
        return s;
    }
}
