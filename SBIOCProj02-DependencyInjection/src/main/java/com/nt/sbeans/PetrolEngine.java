//PetrolEngine.java
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine()
	{
		System.out.println("PetrolEngine.PetrolEngine() :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start() :: Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() :: Engine Stopped");
	}

}
