package com.learn.algo.linkedlist;

import com.learn.algo.common.ListNode;

public class FindNthNodeFromEnd {
  
	public ListNode findnthFromEnd(int n,ListNode List){
		ListNode ntheNodeFromEnd= List;
		int nodepointer =1;
		int curr = 1;
		while(List.next!= null){
			if(curr-nodepointer ==n ){
				ntheNodeFromEnd=ntheNodeFromEnd.next;
				nodepointer++;
			}
			curr++;
			List= List.next;
		}
		return ntheNodeFromEnd;
	}
  }
