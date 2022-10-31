package enumexample;

public class Abc 
{
public final String name = "shubham";
public int height;
public String color;
public String town;
public static String father="shubh";




public void showme(int height, String color, String town) {


	this.height = height;
	this.color = color;
	this.town = town;
}
public void showme()
{
	System.out.println(name);
	System.out.println(this.height);
	System.out.println(this.color);
	System.out.println(this.town);
	System.out.println(father);
	
}
}