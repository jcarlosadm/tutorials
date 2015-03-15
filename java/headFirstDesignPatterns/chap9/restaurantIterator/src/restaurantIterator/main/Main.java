package restaurantIterator.main;

import java.util.ArrayList;

import restaurantIterator.menus.CoffeeMenu;
import restaurantIterator.menus.DinerMenu;
import restaurantIterator.menus.Menu;
import restaurantIterator.menus.PancakeHouseMenu;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(coffeeMenu);
        
        Waitress waitress = new Waitress(menus);
        
        waitress.printMenu();
    }
}
