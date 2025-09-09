//DiselEngine.java
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DiselEngine implements IEngine {
	
	public DiselEngine()
	{
		System.out.println("DiselEngine.DiselEngine() :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("DiselEngine.start() :: Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("DiselEngine.stop() :: Engine Stopped");
	}

}
