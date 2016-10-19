package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class RecursiveReverse {

	
	public ListNode reverse(ListNode List){
		return tailReverse(List,null);
	}
	
	private  ListNode tailReverse(ListNode List, ListNode prev ){
		
		ListNode curr = List.next;
		List.next = prev;
		if(curr == null){
			return List;
		}
		return tailReverse(curr, List);
	}
  }
