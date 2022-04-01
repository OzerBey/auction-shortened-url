package com.ozer.auctionshortenedurl;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

public class Testd {

	@Test
	@Before(value = "bu da sonra la ")
	public static double calculateArea(double radius) {
		System.out.println("sonra da bu çalıştı la ");
		return Math.PI * radius * radius;
	}

}
