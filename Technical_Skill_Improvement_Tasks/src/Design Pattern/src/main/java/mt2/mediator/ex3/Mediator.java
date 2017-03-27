

package mt2.mediator.ex3;


public class Mediator {
    X x;
    Y y;

    public Mediator(){
        
    }

    public void registerX(X x){
        this.x = x;
    }

    public void registerY(Y y){
        this.y = y;
    }

    public void xChanged(int oldX, int newX){
        int delta  = newX - oldX;
        y.setYOnly(y.getY() + 2 * delta);
    }

    public void yChanged(int oldY, int newY){
        int delta = newY - oldY;
        x.setXOnly(x.getX() - 3 *delta);
    }


}
