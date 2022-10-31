package com.xworkz.association;
import com.xworkz.association.*;
public class personRunner {
public static void main(String[] args) {
		
		
		
		city city1 = new city("bengaluru",true,"neeraj","IT");
		 state state1=new state("karnataka","bommai","bjp", 47);
	     country country1 = new country("india","deelhi","modi",37);
		location location1 = new location("newyork",city1,state1,country1);
		address address1 =new address(location1);
		company company1 =new company("MNC","neeraj",address1);
		email email1 =new email("********","asdewe38",839814,company1);
		System.out.println("=========================================");
		city city2 = new city("mumbai",true,"ekmkwl","beach");
		 state state2=new state("kerala","swami","bjp", 47);
	     country country2 = new country("land","gotilla","nope",37);
		location location2 = new location("adda",city2,state2,country2);
		address address2 =new address(location2);
		company company2 =new company("mnnc","rew",address2);
		email email2 =new email("@@@@@","12345678",981014,company2);
		System.out.println("============================================");
		
		email[] email = {email1 ,email2};
		
		job job = new job(20000,"trainee",true,company1);
		
	    person person = new person("puni",email,job);
	    person.showOfPerson();
		person.job.showofjob();
		person.job.company.showofcompany();
		person.job.company.addres.location.city.showOffCity();
		person.job.company.addres.location.country.showOfCountry();
	    person.job.company.addres.location.state.showOffStates();
		 

	}

}
