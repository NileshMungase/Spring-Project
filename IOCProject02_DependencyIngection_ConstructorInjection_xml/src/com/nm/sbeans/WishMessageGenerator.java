package com.nm.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	private LocalDate date;

	// parameterized constructor for constructor injection
	public WishMessageGenerator(LocalTime time, LocalDate date) {
		this.time = time;
		this.date = date;
		System.out.println("WishMessageGenerator::2-parameter constructor");
	}

	// business method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::" + time + "...." + date);
		// get current hour of the day
		int hour = time.getHour();
		// generate wish message based on current hour of the day
		if (hour < 12) {
			return "Good Morning:: " + user;
		} else if (hour < 16) {
			return "Good Afternoon:: " + user;
		} else if (hour < 20) {
			return "Good Evining:: " + user;
		} else {
			return "Good Night: " + user;
		}
	}

}
