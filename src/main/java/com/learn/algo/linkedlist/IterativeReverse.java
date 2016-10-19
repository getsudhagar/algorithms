package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class IterativeReverse {

	public ListNode reverse(ListNode List) {
		ListNode prev = null;
		while (List.next != null) {
			ListNode curr = List;
			List = List.next;
			List.next = prev;
			prev = curr;
		}
		return List;
	}

}
