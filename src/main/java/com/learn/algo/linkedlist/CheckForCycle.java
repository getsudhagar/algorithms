package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class CheckForCycle {
  
	public boolean hasCycle(ListNode List){
		ListNode slow =List;
		ListNode fast =List.next.next;
		while (fast.next.next!= null) {
			if(slow==fast){
				return true;
			}
			fast = fast.next.next;
			slow= slow.next;
		}
		return false;
	}
  }
