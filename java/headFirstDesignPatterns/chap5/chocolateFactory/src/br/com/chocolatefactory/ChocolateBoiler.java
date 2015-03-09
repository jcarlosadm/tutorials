package br.com.chocolatefactory;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static volatile ChocolateBoiler uniqueInstance = null;
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null){
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		
		return uniqueInstance;
	}
	
	public void fill(){
		if(this.isEmpty()){
			this.empty = false;
			this.boiled = false;
		}
	}
	
	public void drain(){
		if(!this.isEmpty() && !this.isBoiled()){
			this.empty = true;
		}
	}
	
	public void boil(){
		if(!this.isEmpty() && !this.isBoiled()){
			this.boiled = true;
		}
	}
	
	public void freeze(){
		if(!this.isEmpty() && this.isBoiled()){
			this.boiled = false;
		}
	}
	
	public boolean isEmpty(){
		return this.empty;
	}
	
	public boolean isBoiled(){
		return this.boiled;
	}
}
