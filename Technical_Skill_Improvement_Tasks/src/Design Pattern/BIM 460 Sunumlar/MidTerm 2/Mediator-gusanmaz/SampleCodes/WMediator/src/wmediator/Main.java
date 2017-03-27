package wmediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        X x = new X(mediator,10);
        Y y = new Y(mediator,5);
        //mediator.registerX(x);
        //mediator.registerY(y);

        System.out.println("After creating X(10) and Y(5)");
        x.print();
        y.print();
        x.setX(12);
        System.out.println("Value of x is now changed to 12");
        x.print();
        y.print();
        y.setY(15);
        System.out.println("value of y is now changed to 15");
        x.print();
        y.print();
        
    }

}
