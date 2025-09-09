package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class SbiocProj01DependencyInjectionApplication {

	@Bean(name = "ldate")
	public LocalDate createDate() {
		System.out.println("SbiocProj01DependencyInjectionApplication.createDate()");
		return LocalDate.now();
	}

	public static void main(String[] args) {
		// create the IOC container
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SbiocProj01DependencyInjectionApplication.class,
				args)) {
			// get spring bean class object reference
			SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);
			// invoke the b.method
			String msg = finder.showSeasonName();
			System.out.println("Season Name :: " + msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
