//Vehicle.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	//HAS-A property
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle()
	{
		System.out.println("Vehicle.Vehicle() :: 0-param constructor");
	}
	
	//b.method
	public void journey(String sourcePlace,String destPlace)
	{
		System.out.println("Vehicle.journey()");
		engine.start();
		System.out.println("Journey Started at :: "+sourcePlace);
		System.out.println("Journey is going on.......");
		engine.stop();
		System.out.println("Journey stopped at :: "+destPlace);
	}
	
}
