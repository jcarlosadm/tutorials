package restaurantIterator.menus;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItens;
    private String name = "Pancake house menu";
    
    public PancakeHouseMenu() {
        this.menuItens = new ArrayList<>();
        
        this.addItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        this.addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99);
        this.addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);
        this.addItem("Waffles", "Waffles with your choice of blueberries or strawberries",
                true, 3.59);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItens.add(menuItem);
    }
    
    @Override
    public Iterator<MenuItem> createIterator(){
        return this.menuItens.iterator();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
