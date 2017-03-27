public class Innova extends Car {

    public Innova(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    protected void buyCar(String performance) {
        System.out.println("Liked Innova  ...  performance... " + performance);
    }
}