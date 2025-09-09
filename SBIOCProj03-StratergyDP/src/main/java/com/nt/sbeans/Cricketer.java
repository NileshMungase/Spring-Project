//Cricketer.java
//target class
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cktr")
public final class Cricketer {
	@Autowired
	@Qualifier("bat")
	private ICricketBat bat;

	public Cricketer() {
		System.out.println("Cricketer.Cricketer() :: 0-param constructor");
	}

	public String batting() {
		System.out.println("Crickter.batting()");
		// use the dependent
		int runs = bat.scoreRuns();
		return "Crickter has scored " + runs + " runs ";
	}

}
