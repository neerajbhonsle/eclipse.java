package com.xworkz.constructor;

public class TextTileShop {
	
		public String ownerName;
		public String ownerWifeName;
		public String ownerDaughterName;
		public long ownerDaughterNumber;
		public String ownersNoOfWifes;
		public int shopNo;
		public long contactNum;
		
		public TextTileShop(String ownerName) {
			this.ownerName=ownerName;
			System.out.println("Declaring the TextTileShop Owner Details");
		}
		public TextTileShop(String ownerName,String ownerWifeName) {
			this(ownerName);
			this.ownerWifeName=ownerWifeName;
			System.out.println("Declaring the TextTileShop ownerWifeName Details");
		}
		public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName) {
			this(ownerName,ownerWifeName);
			this.ownerDaughterName=ownerDaughterName;
			System.out.println("Declaring the TextTileShop ownerName,ownerWifeName,ownerDaughterName Details");
		}
		public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber) {
			this(ownerName,ownerWifeName,ownerDaughterName);
			this.ownerDaughterNumber=ownerDaughterNumber;
			System.out.println("Declaring the TextTileShop ownerName,ownerWifeName,ownerDaughterName Details");
		}
		public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,int shopNo) {
			this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber);
			this.shopNo=shopNo;
			System.out.println("Declaring the TextTileShop ownerName,ownerWifeName,ownerDaughterName Details");
		}
		public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,int shopNo,long contactNum) {
			this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,shopNo);
			this.contactNum=contactNum;
			System.out.println("Declaring the TextTileShop ownerName,ownerWifeName,ownerDaughterName Details");
		}
	}

