package com.exercise23generics.app;
import com.exercise23generics.model.Suma;
import com.exercise23generics.model.Multi;
import com.exercise23generics.model.Subtraction;
public class GenericsApp {

	public static void main(String[] args) {
		Suma<Integer> myObject = new Suma<Integer>(14);
		Suma<String> myObjectString = new Suma<String>("Testo");
		Subtraction<Integer,Integer> myObjectSubtraction = new Subtraction<Integer, Integer>(12,10);
		Subtraction<Integer,Integer> myObjectSubtraction2 = new Subtraction<Integer, Integer>();
		
		System.out.println("Object of myObject "+myObject.getMyObject());
		System.out.println("Object of myObjectString "+myObjectString.getMyObject());
		
		myObjectSubtraction2.setKey(100);
		myObjectSubtraction2.setValue(200);
		System.out.println("Object Sustraction: "+myObjectSubtraction.ToString());
		System.out.println("Object Sustraction2: "+myObjectSubtraction2.ToString());
		
		System.out.println(Multi.MuestraTipoDato(10));
		System.out.println(Multi.MuestraTipoDato("Hola"));
		System.out.println(Multi.MuestraTipoDato(12.5));
		
		System.out.println(Suma.SumaNumeros(14,2));

	}
}
