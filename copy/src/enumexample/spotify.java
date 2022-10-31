package enumexample;
import constant.songs;
public class spotify {
	public static String email="neeraj@gmail.com";
	public static long phoneNumber=9481*104;
	public float otp;
	public songs songs;
	
	public spotify(String email,long phoneNumber,float otp,songs songs)
	{
	
	this.email=email;
	this.phoneNumber=phoneNumber;
	this.otp=otp;
	this.songs=songs;
	}
	public void showcase() {
		System.out.println(this.email);
		System.out.println(this.phoneNumber);
		System.out.println(this.otp);
		System.out.println(this.songs.song_1);
		
	}

}
