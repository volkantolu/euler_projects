package mt2.mediator.ex4;

public class Main {
    public static void main(String[] args) {
        X x = new X(10);
        Y y = new Y(5);
        x.setRelatedY(y);
        y.setRelatedX(x);
        System.out.println("After creating X(10) and Y(5)");
        x.print();
        y.print();
        x.changeX(12);
        System.out.println("Value of x is now changed to 12");
        x.print();
        y.print();
        y.changeY(15);
        System.out.println("value of y is now changed to 15");
        x.print();
        y.print();
    }

}
