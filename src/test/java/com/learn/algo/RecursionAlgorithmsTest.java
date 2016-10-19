package com.learn.algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learn.algo.recursion.Factorial;
import com.learn.algo.recursion.Fibonaci;

public class RecursionAlgorithmsTest {

	
	@Test
	public void factorialTest() {
		Factorial fact = new Factorial();
		assertEquals(24,fact.recursivefactorialFor(4));
		assertEquals(120,fact.tailRecursivefactorial(5));
	}
	
	@Test
	public void febonaciTest() {
		Fibonaci fbn = new Fibonaci();
		assertEquals(1,fbn.tailRecursiveFibonaciNumber(1));
		assertEquals(1,fbn.tailRecursiveFibonaciNumber(2));
		assertEquals(8,fbn.tailRecursiveFibonaciNumber(6));
		assertEquals(13,fbn.tailRecursiveFibonaciNumber(7));
		assertEquals(13,fbn.recursiveFebonaciNumber(7));
	}

}
