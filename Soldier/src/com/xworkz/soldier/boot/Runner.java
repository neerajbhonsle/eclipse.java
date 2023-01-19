package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.Configuration.SpringConfiguration;
import com.xworkz.soldier.DTO.FirstAidDTO;
import com.xworkz.soldier.DTO.MissileDTO;
import com.xworkz.soldier.DTO.ResortDTO;
import com.xworkz.soldier.Service.FirstAidService;
import com.xworkz.soldier.Service.MissileService;
import com.xworkz.soldier.Service.ResortService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = context.getBean(FirstAidService.class);
		boolean saved1 = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved " + saved1);

		ResortService service2 = context.getBean(ResortService.class);
		boolean saved2 = service2.validateAndSave(new ResortDTO());
		System.out.println("saved " + saved2);

		MissileService service3 = context.getBean(MissileService.class);
		boolean saved3 = service3.validateAndSave(new MissileDTO());
		System.out.println("saved " + saved3);
	}

}
