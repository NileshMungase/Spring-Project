//SeasonFinder.java (target spring bean class)
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired // Field Injection
	private LocalDate date;

	// b.method
	public String showSeasonName() {
		// get current month of the year
		int month = date.getMonthValue();
		// find the season name
		if (month >= 3 && month <= 6) {
			return "Summer Season";
		} else if (month >= 7 && month <= 10) {
			return "Rainy Season";
		} else
			return "Winter Season";
	}

}
