package com.xworkz.Programs;

public class Printname {

	public static void main(String[] args) {
		int n=4;
		//main loop
		for (int i=1;i<=n;i++) {
			//printing space
			for (int j=n-1;j>=i;j--) {
				if(j==2) {
					System.out.print("neeraj");
				}else {
				System.out.print(j);
				}
			}
			for (int k=1;k<=i;k++){
				if (k==2) {
					System.out.print("neeraj");
				}else {
					System.out.print(k);
			}
			}
			System.out.println("");
		}
		
	}
	}


