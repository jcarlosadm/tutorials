package restaurantIterator.menus;

import java.util.Hashtable;
import java.util.Iterator;

public class CoffeeMenu implements Menu{

    Hashtable<String, MenuItem> menuItems = new Hashtable<>();
    private String name = "Coffee Menu";
    
    public CoffeeMenu() {
        this.addItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lecture, tomato, and fries", true, 3.99);
        this.addItem("Soup of the day", "A cup of soup of the day, with a side salad",
                false, 3.69);
        this.addItem("Burrito", "A large burrito, with whole beans, salsa, guacamole",
                true, 4.29);
    }
    
    public void addItem(String name, String description, boolean vegetarian,
            double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(menuItem.getName(), menuItem);
    }
    
    @Override
    public Iterator<MenuItem> createIterator() {
        return this.menuItems.values().iterator();
    }

    @Override
    public String getName() {
        return this.name;
    }

}
