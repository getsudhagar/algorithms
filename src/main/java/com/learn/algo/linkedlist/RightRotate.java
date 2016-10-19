package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class RightRotate {
	
	public ListNode rotaterightBy(int n,ListNode List){
		if(List==null || n==0 ){
			return List;
		}
		ListNode currentHead = null;
		ListNode oldHead = List;
		int pointer = 1;
		while(List.next!= null){
			if(n==pointer){
				currentHead = List;
			}
			pointer++;
		}
		List.next= oldHead;
	    return currentHead;
	}
  
  }
