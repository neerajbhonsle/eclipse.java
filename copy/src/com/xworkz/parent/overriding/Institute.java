package com.xworkz.parent.overriding;

public class Institute {
	private String name;
	private String branch;
	private String owner;
	private String ownerwife;
	private int noOfTrainers;
	private int noOfHr;
	private String nameOfHR;
	private boolean HRstatus;
	private String reciptionName;
	private int noOfreciption;
	public Institute(String name,String branch,String owner,String ownerwife,
			int noOfTrainer,int noOfHr,String nameOfHR,
			boolean HRstatus,String reciptionName,int noOfreciption) {
		super();
		this.name=name;
		this.branch=branch;
		this.owner=owner;
		this.ownerwife=ownerwife;
		this.noOfTrainers=noOfTrainer;
		this.noOfHr=noOfHr;
		this.nameOfHR=nameOfHR;
		this.HRstatus=HRstatus;
		this.reciptionName=reciptionName;
		this.noOfreciption=noOfreciption;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerwife() {
		return ownerwife;
	}
	public void setOwnerwife(String ownerwife) {
		this.ownerwife = ownerwife;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public int getNoOfHr() {
		return noOfHr;
	}
	public void setNoOfHr(int noOfHr) {
		this.noOfHr = noOfHr;
	}
	public String getNameOfHR() {
		return nameOfHR;
	}
	public void setNameOfHR(String nameOfHR) {
		this.nameOfHR = nameOfHR;
	}
	public boolean isHRstatus() {
		return HRstatus;
	}
	public void setHRstatus(boolean hRstatus) {
		HRstatus = hRstatus;
	}
	public String getReciptionName() {
		return reciptionName;
	}
	public void setReciptionName(String reciptionName) {
		this.reciptionName = reciptionName;
	}
	public int getNoOfreciption() {
		return noOfreciption;
	}
	public void setNoOfreciption(int noOfreciption) {
		this.noOfreciption = noOfreciption;
	}
	@Override
	public String toString() {
		return "Institute [name=" + name + ", branch=" + branch + ", owner=" + owner + ", ownerwife=" + ownerwife
				+ ", noOfTrainers=" + noOfTrainers + ", noOfHr=" + noOfHr + ", nameOfHR=" + nameOfHR + ", HRstatus="
				+ HRstatus + ", reciptionName=" + reciptionName + ", noOfreciption=" + noOfreciption + "]";
	}
	public boolean equals(Object aa) {
		if(aa instanceof Institute) {
			Institute casted=(Institute)aa;
			if(this.name.equals(name)&&this.branch.equals(branch)&&this.owner.equals(owner)&&this.ownerwife.equals(ownerwife)&&this.nameOfHR.equals(nameOfHR)&&
					this.reciptionName.equals(reciptionName)) {
				System.out.println("name,branch,owner,ownerwife,nameofhr & reciptionname are equal");
				return true;
			}
		}else {
			System.err.println("they are not equal");
		}
		return false;
	}
}
