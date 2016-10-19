package com.learn.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.learn.algo.common.ListNode;
import com.learn.algo.linkedlist.LeftRotate;
import com.learn.algo.linkedlist.RecursiveReverse;


public class LinkedListAlgorithmsTest {

	
	private ListNode root = null;
	
	private ListNode child4 = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		root = new ListNode(5);
		ListNode child1 = new ListNode(4);
		root.next=child1;
		ListNode child2 = new ListNode(3);
		child1.next=child2;
		ListNode child3 = new ListNode(2);
		child2.next=child3;
		child4 = new ListNode(1);
		child3.next=child4;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@After
	public void tearDown() throws Exception {
      
	}
	
	@Test
	public void factorialTest() {
		ArrayList<String> w = new ArrayList<String>();
		  List k = new LinkedList();
	        Queue k2 = new LinkedList();
	        LinkedList Stack = new LinkedList();
	        Stack.push(3);
	        Stack.push(4);
	        System.out.println(Stack.pop());
	        System.out.println(Stack.pop());
	        k.add(1);
	        k.add(222);
	        k.add(34);
	       // Arrays.sort(arg0);
	        //Arrays.so
	       // k.add(0, 33);
	        //k.sort(paramComparator);
	        k.add(0,22);
	        Collections.sort(w);
	        Collections.sort(k);
	        System.out.println(k.toArray());
		LeftRotate leftRotate = new LeftRotate();
	}
	
	/*@Test
	public void reverseLinkedListUsingRecursionTest() {
		RecursiveReverse recurseList = new RecursiveReverse();
		ListNode k =  recurseList.reverse(root);
	}*/

}
