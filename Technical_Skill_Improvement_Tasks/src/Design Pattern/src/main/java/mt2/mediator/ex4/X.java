
package mt2.mediator.ex4;

public class X {
    private int x;
    private Y y;

    public X(int x){
        this.x = x;
    }

    public void setRelatedY(Y y){
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void changeX(int x){
        int change = x - this.x;
        this.x = x;
        manipulateY(change);
    }

    public int getX(){
        return x;
    }

    public void print(){
        System.out.println("X is "+x);
    }

    public void manipulateY(int change){
        y.setY(y.getY() + 2*change);
    }


}