//SGBat.java
package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("sgBat")
public final class SGBat implements ICricketBat {

	public SGBat() {
		System.out.println("SGBat :: 0-param constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("SGBat.scoreRuns()");
		int score = new Random().nextInt(200);
		return score;
	}

}
