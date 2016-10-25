package com.learn.algo.hash;

/**
 *a):Juggling Algorithm
 *This is an extension of method 2. Instead of moving one by one, divide the array in different sets
 *where number of sets is equal to GCD of n and d and move the elements within sets.
 *If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.
 *Here is an example for n =12 and d = 3. GCD is 3 and
 *
 * b):Reversal algorithm for array rotation
 *   
 */
public class ArrayRotation {
	
	public void rotateUsingRevarsalAlgorithm(int[] a, int d) {
		int n = a.length;
		rverese(a, 0, d - 1);
		rverese(a, d, n - 1);
		rverese(a, 0, n - 1);
	}

	public void rotateUsingBlockAlgorithm(int[] a, int d) {
		int j, temp;
		int n = a.length;
		int blk = gcd(d, n);
		for (int i = 0; i < blk; i++) {
			// move values of block i
			j = i;
			while (j + d < n) {
				temp = a[j + d];
				a[j + d] = a[i];
				a[j + d] = temp;
				j = j + d;
			}
		}
	}

	private int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	private void rverese(int arr[], int from, int to) {
		int tmp;
		while (from < to) {
			tmp = arr[from];
			arr[from] = arr[to];
			arr[to] = tmp;
			from++;
			to--;
		}
	}
}
