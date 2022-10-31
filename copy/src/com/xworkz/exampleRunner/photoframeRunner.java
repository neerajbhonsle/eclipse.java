package com.xworkz.exampleRunner;
import com.xworkz.example.photoFrame;
public class photoframeRunner {

	public static void main(String[] args) {
		String[] items1= {"red","yellow","green","blue"};
		String[] items2= {"wallframe","stand","bottles","phonecover"};
		String[] items3= {"punith","ganesh","adarsh","naveen"};
		String[] items4= {"plastic","paper","glass"};
		String[] items5= {"small","medium","large","extralarge"};
		photoFrame photo=new photoFrame(0, 0, 0, false, "agcreations",items1,items2,items3,items4,items5);
		photo.display();
	}

}
