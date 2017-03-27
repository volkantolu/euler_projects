abstract class Car {

    public double price = 5.5;
    public String color = "Silver";
    public String size = "Small";

    // The Next Element in the Chain of Responsibility
    protected Car next;

    protected Car searchNext(Car car) {
        next = car;
        return this;
    }

    public void trail(String performance) {
        // The condition for traversing in the chain
        if (price < 10 && performance.equalsIgnoreCase("Satisfactory")) {
            buyCar(performance);
        }
        else
        {
            if (next != null)
                next.trail(performance);
        }
    }

    abstract protected void buyCar(String performance);
}