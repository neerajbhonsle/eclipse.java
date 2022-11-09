package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Politicalparty;

public class Bjp extends Politicalparty {
	public boolean rulingparty;
	public Bjp(String partyLeader, int totalmembers,boolean rulingparty) {
		super(partyLeader, totalmembers);
		this.rulingparty=rulingparty;
	}
public void showparty() {
	super.showparty();
	System.out.println(this.rulingparty);
}
	
	

}
