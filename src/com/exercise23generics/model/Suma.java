package com.exercise23generics.model;

public class Suma <T> {
	T myObject;
	public Suma(T myObject) {
		this.myObject = myObject;
	}
	
	public T getMyObject() {
		return this.myObject;
	}
	public static <T extends Number, T2 extends Number> T SumaNumeros(T object1, T2 object2){
		Double result=0.0;
		/*Double objDouble1=0.0, objDouble2=0.0;
		if(object1 instanceof Double && object2 instanceof Double) {
			objDouble1 = ((Double) object1).doubleValue();
			objDouble2 = ((Double) object2).doubleValue();
		}
		return objDouble1+objDouble2;*/
		result = object1.doubleValue()+object2.doubleValue();
		return (T) result;
	}
}
