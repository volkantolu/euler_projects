package mt2.chainOfResponsibility.ex1;

public class SearchCars {

    public static void main(String[] args) {

        System.out.println("\n");

        Car car = new Toyota(9.5, "black", "big").searchNext(new Innova(18.5, "silver", "medium")).searchNext(new Corolla(5,"black","small"));
        car.trail("Satisfactory");

        Car car2 = new Corolla(17.5, "black", "big").searchNext(new Innova(3.5, "silver", "medium"));
        car2.trail("Satisfactory");

        Car car3 = new Corolla(8.5, "black", "big").searchNext(new Toyota(15, "silver", "medium"));
        car3.trail("Satisfactory");

    }

}