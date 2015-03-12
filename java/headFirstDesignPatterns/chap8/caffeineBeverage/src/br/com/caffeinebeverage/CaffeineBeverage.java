package br.com.caffeinebeverage;

public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    
    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    /**
     * hook do template method. Isso é opcional na implementação
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
