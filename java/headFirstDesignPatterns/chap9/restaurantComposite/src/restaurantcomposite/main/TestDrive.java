package restaurantcomposite.main;

import restaurantcomposite.menu.Menu;
import restaurantcomposite.menu.MenuComponent;
import restaurantcomposite.menu.MenuItem;

public class TestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent coffeeMenu = new Menu("Coffee Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Desser of course!");
        
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(coffeeMenu);
        
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with letture & tomato on whole wheat",true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with letture & tomato on whole wheat",
                false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with a saurkraut, relish, onions, topped with cheese",
                false, 3.05));
        dinerMenu.add(dessertMenu);
        
        pancakeHouseMenu.add(new MenuItem("K&B Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",true, 3.59));
        
        coffeeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lecture, tomato, and fries", true, 3.99));
        coffeeMenu.add(new MenuItem("Soup of the day",
                "A cup of soup of the day, with a side salad",false, 3.69));
        coffeeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole beans, salsa, guacamole",true, 4.29));
        
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped"
                + " with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheese", "A normal cheese", false, 0.49));
        
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        
        waitress.printVegetarianMenu();
        
    }
}
