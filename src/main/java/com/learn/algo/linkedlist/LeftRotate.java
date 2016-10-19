package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class LeftRotate {
	
	
	public ListNode rotateLefttBy(int n,ListNode List){
		if(List==null || n==0 ){
			return List;
		}
		ListNode currentHead = List;
		int pointer = 1;
		while(List.next!= null){
			if(n==pointer){
				ListNode curr = List.next;
				List.next= null;
				List= curr;
			}
			pointer++;
		}
		List.next= currentHead;
	    return List;
	}
  
  }
