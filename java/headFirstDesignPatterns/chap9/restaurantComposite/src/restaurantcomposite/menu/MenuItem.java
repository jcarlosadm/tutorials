package restaurantcomposite.menu;

import java.util.Iterator;

import restaurantcomposite.iterator.NullIterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;
    
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public String getDescription(){
        return this.description;
    }
    
    @Override
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public boolean isVegetarian(){
        return this.vegetarian;
    }
    
    @Override
    public void print(){
        System.out.print(" "+this.getName());
        if(this.isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+this.getPrice());
        System.out.println("      -- "+this.getDescription());
    }
    
    public Iterator<Object> createIterator(){
        return new NullIterator();
    }
}
