package com.xworkz.parent.overriding;

public class Politicalparty {
public String partyLeader;
public int totalmembers;
public Politicalparty(String partyLeader,int totalmembers) {
super();
System.out.println("detials of political party ");
this.partyLeader=partyLeader;
this.totalmembers=totalmembers;
}
public void showparty() {
	System.out.println(this.partyLeader);
	System.out.println(this.totalmembers);
}
}
