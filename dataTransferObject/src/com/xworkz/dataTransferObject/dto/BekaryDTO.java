package com.xworkz.dataTransferObject.dto;

public class BekaryDTO extends AbstractAudit {
	private String name;
	private String ownerName;
	private String location;
	private long contactNo;

	public BekaryDTO() {
		// TODO Auto-generated constructor stub
	}

	public BekaryDTO(String name, String ownerName, String location, long contactNo) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", contactNo="
				+ contactNo + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}
