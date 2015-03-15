package restaurantcomposite.iterator;

import java.util.Iterator;
import java.util.Stack;

import restaurantcomposite.menu.Menu;
import restaurantcomposite.menu.MenuComponent;

public class CompositeIterator implements Iterator<Object>{

    Stack<Iterator<Object> > stack = new Stack<>();
    
    public CompositeIterator(Iterator<Object> iterator) {
        this.stack.push(iterator);
    }
    
    @Override
    public boolean hasNext() {
        if(this.stack.isEmpty()){
            return false;
        }else{
            Iterator<Object> iterator = (Iterator<Object>) stack.peek();
            if(!iterator.hasNext()){
                this.stack.pop();
                return this.hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            Iterator<Object> iterator = (Iterator<Object>) this.stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                this.stack.push((Iterator<Object>)(((Menu) component).createIterator()));
            }
            return component;
        }else{
            return null;
        }
    }
    
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }

}
