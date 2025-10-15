package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create  IOC container 
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target spring bean class obj ref
		SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		//invoke the b.method
		String msg=finder.showSeasonName();
		System.out.println("Season name::"+msg);
		
		//close the IOC container
		 ctx.close();

	}

}
