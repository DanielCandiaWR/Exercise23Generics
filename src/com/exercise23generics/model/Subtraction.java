package com.exercise23generics.model;

public class Subtraction <K, V>{
	K key;
	V value;
	public Subtraction() {
		
	}
	
	public Subtraction(K key,V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return this.value;
	}
	public String ToString() {
		return "Key: "+this.key+" Value: "+this.value;
	}
}
