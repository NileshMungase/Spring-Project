package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Cricketer;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class SbiocProj03StratergyDpApplication {

	public static void main(String[] args) {
		//get Access to IOC container
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SbiocProj03StratergyDpApplication.class, args))
		{
			//get target spring bean class object reference 
			Cricketer cktr = ctx.getBean("cktr",Cricketer.class);
			//invoke the b.method
			String msg = cktr.batting();
			System.out.println(msg);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
