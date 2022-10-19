package com.xworkz.exampleRunner;
import com.xworkz.example.Books;
public class BooksRunner {

	public static void main(String[] args) {
		String[] items1 = {"Fantasy","Romance","Mystery"};
		String[] items2 = {"Emma","Jane Eyre","David Copperfield","The God Father"};
		String[] items3 = {"Jane Austin","Charlotte Bronte","Miss Fortune","Mario Puzo"};
		double[] items4 = {340.0,150.0,2000.0};
		long[]   items5 = {13458345,79454345,14553545};
		String[] items6 = {"India","Russia","South Korea"};
		
		Books pass = new Books("God Father","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();
		

	}



}
