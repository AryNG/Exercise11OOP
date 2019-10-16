package com.exercise11oop.app;
import com.exercise11oop.model.Perro;
public class PerroApp {

	public static void main(String[] args) {
		Perro pluto = new Perro();
		
		pluto.height=50;
		pluto.age=15;
		pluto.id=10;
		
		System.out.println("Plutos's id: "+pluto.id);
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		

	}

}
