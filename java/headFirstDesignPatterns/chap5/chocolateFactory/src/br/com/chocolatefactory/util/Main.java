package br.com.chocolatefactory.util;

import br.com.chocolatefactory.ChocolateBoiler;

public class Main {
	public static void main(String[] args) {
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		
		cb.fill();
		cb.boil();
		//cb.freeze();
		//cb.drain();
		
		if (cb.isBoiled()) {
			System.out.println("boiled");
		}
		if (cb.isEmpty()) {
			System.out.println("empty");
		}
		
		cb = ChocolateBoiler.getInstance();
		if (cb.isBoiled()) {
			System.out.println("boiled");
		}
		if (cb.isEmpty()) {
			System.out.println("empty");
		}
	}
}
