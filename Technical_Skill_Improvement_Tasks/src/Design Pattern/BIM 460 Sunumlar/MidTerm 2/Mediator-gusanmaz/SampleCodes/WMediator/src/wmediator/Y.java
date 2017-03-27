
package wmediator;

public class Y {
    private int y;
    private Mediator mediator;

    public Y(Mediator mediator, int y){
        this.y = y;
        this.mediator = mediator;
        mediator.registerY(this);
    }

    public void setY(int y){
        int oldY = this.y;
        this.y = y;
        mediator.yChanged(oldY, y);
    }

    public void setYOnly(int y){
        this.y = y;
    }

     public int getY(){
        return y;
    }

    public void print(){
        System.out.println("Y is "+y);
    }


}