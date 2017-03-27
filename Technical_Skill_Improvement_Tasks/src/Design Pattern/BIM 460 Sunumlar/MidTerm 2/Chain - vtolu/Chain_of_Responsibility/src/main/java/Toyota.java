public class Toyota extends Car {

    public Toyota(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    protected void buyCar(String performance) {
        System.out.println("Liked Toyota  ...  performance... " + performance);
    }
}