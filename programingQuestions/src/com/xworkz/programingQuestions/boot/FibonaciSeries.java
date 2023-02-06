package com.xworkz.programingQuestions.boot;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		/*int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=10;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}*/
		/*int n=141;
		int temp  ,r,sum=0;
		
		temp=n;
		while(n>= 0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("given number is pallindrom:"+sum);
		}
		else {
			System.out.println("given number not a  pallindrom:"+sum);
		}
		*/
		
		String name="nayan";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		if(rev.equals(name)) 
		{
			System.out.println("given String is a pallindrome:"+name);
		}
		else
		{
			System.out.println("given String not  a pallindrome:"+name);
		}
		

	}

}
