package edu.anadolu.bim460;


public class MealDirector {
    private MealBuilder mealBuilder = null;


    public void setMealDirector(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
    
}
