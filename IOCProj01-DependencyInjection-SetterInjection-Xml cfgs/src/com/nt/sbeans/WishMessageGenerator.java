//WishMessageGenerator.java (Target spring bean class)
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time; // HAS-A property
	private LocalDate date; // HAS-A property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	// setter method for setter Injection (alt+shift+s, r)
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime(-)");
		this.time = time;
	}

	public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	// b.method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::" + time + "......" + date);
		// get current hour of the day
		int hour = time.getHour();
		// generate wish message based on current hour of the day
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good Afternoon:" + user;
		else if (hour < 20)
			return "Good Evening :" + user;
		else
			return "Good Night:" + user;
	}

}
