//DependencyInjectionTest.java
package com.nt.main;

import java.util.Arrays;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()");
		// crete IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/applicationContext.xml");

		/*
		 * //get Target Spring bean class obj ref Object obj=ctx.getBean("wmg");
		 * WishMessageGenerator generator=(WishMessageGenerator)obj; //invoke the
		 * b.method String result=generator.showWishMessage("raja");
		 * System.out.println("Result is ::"+result);
		 */
		String ids[] = ctx.getBeanDefinitionNames();
		System.out.println("Bean ids are ::" + Arrays.toString(ids));
		// close the IOC cotnainer
		ctx.close();
		System.out.println("DependencyInjectionTest.main()");
	}

}
