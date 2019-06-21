package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PremierJUnit5Test {
	@Test
	void premierTest() {
		String message = "1+1 should be equal to 2";
		System.out.println(message);

		assertEquals(2, 1 + 1, message);
	}
}
