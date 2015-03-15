package restaurantcomposite.main;

import java.util.Iterator;

import restaurantcomposite.menu.MenuComponent;

public class Waitress {
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu(){
        this.allMenus.print();
    }
    
    public void printVegetarianMenu(){
        Iterator<Object> iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n-----------------------");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
