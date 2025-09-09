//CNGEngine.java
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine {
	
	public CNGEngine()
	{
		System.out.println("CNGEngine.CNGEngine() :: 0-param constrctor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine.start() :: Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()::Engine Stopped");
	}

}
