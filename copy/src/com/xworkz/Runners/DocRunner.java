package com.xworkz.Runners;
import com.xworkz.child.Cardio;
import com.xworkz.child.Dentist;
import com.xworkz.child.ENT;
import com.xworkz.parent.Doctor;
public class DocRunner {

	public static void main(String[] args) {
	Doctor doctor=new Doctor();
	System.out.println(doctor.name);
	System.out.println(doctor.Specialist);
	System.out.println("********************************************");
	Dentist dentist=new Dentist();
	System.out.println(dentist.totalyeartocompletecourse);
	System.out.println(dentist.nameofhospital);
	System.out.println("********************************************");
	Doctor doc=(Dentist)dentist;
	System.out.println(doc.name);
	System.out.println(doc.Specialist);
	System.out.println("********************************************");
	ENT ent=new ENT();
	System.out.println(ent.collegename);
	System.out.println(ent.exp);
	System.out.println("********************************************");
	Doctor doc1=(ENT)ent;
	System.out.println(doc1.name);
	System.out.println(doc1.Specialist);
	System.out.println("********************************************");
	Cardio cardio=new Cardio();
	System.out.println(cardio.age);
	System.out.println(cardio.income);
	System.out.println("********************************************");
	Doctor doc2=(Cardio)cardio;
	System.out.println(cardio.name);
	System.out.println(cardio.Specialist);
	System.out.println("Mugithu");

	}

}
