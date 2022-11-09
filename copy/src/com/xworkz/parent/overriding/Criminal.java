package com.xworkz.parent.overriding;

public class Criminal {
public String name;
public int idnumber;
public Criminal(String name,int idnumber) {
super();
System.out.println("details of criminal");
this.name=name;
this.idnumber=idnumber;

}
public void showbuddy() {
	System.out.println(this.name);
	System.out.println(this.idnumber);
}
}
