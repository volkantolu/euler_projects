package mt2.chainOfResponsibility.ex1;

public class Corolla extends Car{

    public Corolla(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    protected void buyCar(String performance) {
        System.out.println("Liked Corolla ...  performance... " + performance);
    }
}
