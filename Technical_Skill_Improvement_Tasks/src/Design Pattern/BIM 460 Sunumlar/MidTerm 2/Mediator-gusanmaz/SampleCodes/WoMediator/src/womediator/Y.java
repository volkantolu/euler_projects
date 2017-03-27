
package womediator;

public class Y {
    private int y;
    private X x;

    public Y(int y){
        this.y = y;
    }

    public void setRelatedX(X x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

     public int getY(){
        return y;
    }

     public void changeY(int y){
        int change = y - this.y;
        this.y = y;
        manipulateX(change);
    }

    public void print(){
        System.out.println("Y is "+y);
    }

    public void manipulateX(int change){
        x.setX(x.getX()-3*change);
    }


}