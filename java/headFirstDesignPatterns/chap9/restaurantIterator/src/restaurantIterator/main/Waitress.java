package restaurantIterator.main;

import java.util.ArrayList;
import java.util.Iterator;

import restaurantIterator.menus.Menu;
import restaurantIterator.menus.MenuItem;

public class Waitress {
    ArrayList<Menu> menus;
    
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }
    
    public void printMenu(){
        Iterator<Menu> menuIterator = this.menus.iterator();
        Menu menu = null;
        
        while (menuIterator.hasNext()) {
            menu = (Menu) menuIterator.next();
            System.out.println("\n"+menu.getName()+"\n");
            this.printMenu(menu.createIterator());
            System.out.println("------------------------------------");
        }
    }
    
    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName()+ ", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
