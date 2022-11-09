package com.xworkz.parent.overriding;

public class Director {
public String name;
public int numberOfMovies;
public Director(String name,int numberOfMovies) {
super();
System.out.println("detials of director");
this.name=name;
this.numberOfMovies=numberOfMovies;
}
public void showdirection() {
	System.out.println(this.name);
	System.out.println(this.numberOfMovies);
}
}
