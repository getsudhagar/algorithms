package com.learn.algo.array;

import java.util.PriorityQueue;
/**
 * Maintain a min heap and remove elements simultaneously
 *
 */
public class KthLargest {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			q.offer(i);
            // Remove simultaneously as we have to it later otherwise.
			if (q.size() > k) {
				q.poll();
			}
		}

		return q.peek();
	}

}
