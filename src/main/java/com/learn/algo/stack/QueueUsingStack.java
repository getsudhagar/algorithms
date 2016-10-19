package com.learn.algo.stack;

import java.util.Stack;

public class QueueUsingStack<T> {
	
	private Stack<T>  stack1 = new Stack<T>();
	private Stack<T>  stack2 = new Stack<T>();
	
	public int push(T obj){
		return (Integer)stack1.push(obj);
	}
	
	public int pop(){
		if(stack2.isEmpty()){
			while(stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return (Integer)stack2.pop();
	}

}
