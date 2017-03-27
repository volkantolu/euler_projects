package edu.anadolu.bim460;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MealDirector mealDirector = new MealDirector();

        MealBuilder mealBuilder = new ItalianMealBuilder();
        mealDirector.setMealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        System.out.println("meal is: " + meal);

        mealBuilder = new JapaneseMealBuilder();
        mealDirector.setMealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        System.out.println("meal is: " + meal);

    }
}
