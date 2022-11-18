package com.xworkz.Programs;

public class Printk {

	public static void main(String[] args) {
		int n=4;
		//main loop
		for (int i=1;i<=n;i++) {
			//printing space
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println("");
		}
		
	}

	}

