package br.com.pizza;

import br.com.pizza.ingredient.Cheese;
import br.com.pizza.ingredient.Clam;
import br.com.pizza.ingredient.Dough;
import br.com.pizza.ingredient.Pepperoni;
import br.com.pizza.ingredient.Sauce;
import br.com.pizza.ingredient.Veggies;

public abstract class Pizza {
	protected String name = null;
	protected Dough dough = null;
	protected Sauce sauce = null;
	protected Veggies veggies[] = null;
	protected Cheese cheese = null;
	protected Pepperoni pepperoni = null;
	protected Clam clam = null;
	
	protected abstract void prepare();
	
	protected void bake(){
		System.out.println("Assar por 25 minutos a 350º");
	}
	
	protected void cut(){
		System.out.println("Cortar a pizza em fatias diagonais");
	}
	
	protected void box(){
		System.out.println("Colocar a pizza na caixa");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		String str = "";
		if(this.dough != null) str += " "+this.dough.getName()+"|";
		if(this.sauce != null) str += " "+this.sauce.getName()+"|";
		if(this.cheese != null) str += " "+this.cheese.getName()+"|";
		if(this.clam != null) str += " "+ this.clam.getName()+"|";
		return this.name+" with "+ str;
	}
}
