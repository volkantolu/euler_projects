package edu.anadolu.bim460;

public abstract class MyCafeWithHook {

    /*
     * Template Method
     */
   final void prepareRecipe(){
       boilWater();
       brew();
       pourInCup();
       if(customerWantsCondiments()){
            addCondiments();
       }
   }

    /*
     * These methods are implemented by subclasses.
     */
    
    abstract void brew();
    abstract void addCondiments();

    /*
     * These methods are declared final so that subclasses can't override.
     * They can be used in template method directly.
     */

    final void boilWater(){
        System.out.println("Boiling water");
    }

    final void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /*
     * Hook method.
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
