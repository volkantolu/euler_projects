package edu.anadolu.bim460;

public class MyCafeTest {
    public static void main(String args[]){
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("Making coffee:");
        coffee.prepareRecipe();

        TeaWithHook tea = new TeaWithHook();
        System.out.println("Making tea:");
        tea.prepareRecipe();

    }
}
