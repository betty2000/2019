package com.tom;

public class Animal {
	String name;
	int age;
    public Animal(String name, int age ) {
    	this.name = name;
    	this.age = age;
    	
    }

	public  void print() {
		System.out.println(name + "/t " + age);
		

	}

}
