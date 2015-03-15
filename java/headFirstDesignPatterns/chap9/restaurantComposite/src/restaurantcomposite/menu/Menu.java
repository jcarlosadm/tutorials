package restaurantcomposite.menu;

import java.util.ArrayList;
import java.util.Iterator;

import restaurantcomposite.iterator.CompositeIterator;

public class Menu extends MenuComponent {
    ArrayList<Object> menuComponents = new ArrayList<>();
    String name;
    String description;
    
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) this.menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.print("\n"+this.getName());
        System.out.println(",    "+this.getDescription());
        System.out.println("-------------------------------");
        
        Iterator<Object> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
    
    public Iterator<Object> createIterator(){
        return new CompositeIterator(this.menuComponents.iterator());
    }
    
}
