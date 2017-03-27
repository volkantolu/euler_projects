package mt1.builder.ex1;

abstract public class MealBuilder {
    public abstract void buildDrink();

    public abstract void buildMainCourse();

    public abstract void buildSide();

    public abstract Meal getMeal();
    
}
