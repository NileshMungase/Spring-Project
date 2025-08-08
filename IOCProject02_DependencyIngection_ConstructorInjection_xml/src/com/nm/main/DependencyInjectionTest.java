package com.nm.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nm.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()");
		// create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nm/cfgs/applicationContext.xml");
		// get target spring bean class object reference
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		// involve the business method
		String result = generator.showWishMessage("Nilesh");
		System.out.println("Result is :: " + result);

		// close the IOC container
		ctx.close();
		System.out.println("DependencyInjectionTest.main()");
	}

}
