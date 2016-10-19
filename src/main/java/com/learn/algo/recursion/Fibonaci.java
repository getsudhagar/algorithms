package com.learn.algo.recursion;

public class Fibonaci {
  
	public int tailRecursiveFibonaciNumber( int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n==2){
			return 1;
		}
		return recurse(n,0,1);
	}
	
	public int recursiveFebonaciNumber(int n){
		return recurse(n);
	}
	private int recurse(int num, int prev,int curr ) {
		if (num == 1)
			return curr;
		return recurse(num - 1,curr,curr+prev);
	}
	
	private int recurse(int num) {
		if (num == 1 || num ==2)
			return 1;
		return recurse(num-1)+recurse(num-2);
	}
  }
