package com.learn.algo.recursion;

public class Factorial {

	public int tailRecursivefactorial(int n) {
		Integer total = 1;
		if (n == 0)
			return 0;
		return tailRecurse(n, total);
	}
	
	public int recursivefactorialFor(int n) {
		if (n == 0)
			return 0;
		return recurse(n);
	}

	private int tailRecurse(int num, int value) {
		if (num == 0)
			return value;
		return tailRecurse(num - 1, value * num);
	}
	
	private int recurse(int num) {
		if (num == 1)
			return 1;
		return num * recurse(num - 1);
	}
}
