
package mt2.mediator.ex3;

public class X {
    private int x;
    Mediator mediator;

    public X(Mediator mediator, int x){
        this.x = x;
        this.mediator = mediator;
        mediator.registerX(this);
    }

    public void setX(int x){
        int oldX = this.x;
        this.x = x;
        mediator.xChanged(oldX, x);
    }

    public void setXOnly(int x){
        this.x = x;
    }

   

    public int getX(){
        return x;
    }

    public void print(){
        System.out.println("X is "+x);
    }



}