package restaurantIterator.menus;

import java.util.Iterator;

import restaurantIterator.iterators.DinerMenuIterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    private String name = "Diner Menu";
    
    public DinerMenu(){
        this.menuItems = new MenuItem[MAX_ITEMS];
        
        this.addItem("Vegetarian BLT", "(Fakin') Bacon with letture & tomato on whole wheat",
                true, 2.99);
        this.addItem("BLT", "Bacon with letture & tomato on whole wheat", false, 2.99);
        this.addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);
        this.addItem("Hotdog", "A hot dog, with a saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        
        if(this.numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }else{
            this.menuItems[this.numberOfItems] = menuItem;
            this.numberOfItems += 1;
        }
    }
    
    @Override
    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(this.menuItems);
    }
    
    @Override
    public String getName(){
        return this.name;
    }
}
