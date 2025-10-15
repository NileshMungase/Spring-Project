//SeasonFinder.java
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private   LocalDate  date;  //HAS-A property   (Composition)
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param constructor");
	}
	
	//setter method for setter Injection
	@Autowired
	public  void  setDate(LocalDate  date) {
		System.out.println("SeasonFinder.setDate()");
		this.date=date;
	}
	
	//b.method
	public   String showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()");
		//get  current month value
		   int month=date.getMonthValue();
		   if(month>=3  && month<=6)
			   return "Summer Season";
		   else if(month>=7 && month<=10)
			   return  "Rainy Season";
		   else
			   return  "Winter Season";
	}

}
