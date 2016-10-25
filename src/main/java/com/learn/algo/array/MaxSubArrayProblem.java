package com.learn.algo.array;

/**
 *  Kadane's algorithm  with complexity O(n)
 *  https://en.wikipedia.org/wiki/Maximum_subarray_problem
 */
public class MaxSubArrayProblem {

	public int maxSubArray(int[] a){
		int upto_max =a[0];
		int max_so_far =a[0];
		for(int i=1;i<a.length;i++){
			upto_max =Math.max(a[i], upto_max+a[i]);
			max_so_far =Math.max(max_so_far, upto_max);
		}
		return max_so_far;
	}
}
