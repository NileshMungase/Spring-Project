package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class SbiocProj02DependencyInjectionApplication {

	public static void main(String[] args) {
		// get the IOC container
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SbiocProj02DependencyInjectionApplication.class,
				args)) {
			// get access to target spring bean class object
			Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
			// invoke the b.method
			vehicle.journey("Home", "Pune");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
