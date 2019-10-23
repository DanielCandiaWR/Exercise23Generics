package com.exercise23generics.model;

public class Multi {
	public static <T> String MuestraTipoDato(T object) {
		
		return "Tipo de dato es: "+object.getClass()+
				"\n Nombre del parámetro: "+object.getClass().getName()+
				"\n Valor del elemento: "+object;
	}
}
