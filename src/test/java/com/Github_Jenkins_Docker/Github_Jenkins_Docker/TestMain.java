package com.Github_Jenkins_Docker.Github_Jenkins_Docker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMain {
	@Test
	public void testInputIsEven() {
		assertTrue(Main.checkIfInputIsAnEvenNumber(23));
	}
}
