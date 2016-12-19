package com.learn.algo.tree;

import java.util.Stack;
import com.learn.algo.common.TreeNode;

/**
 *https://en.wikipedia.org/wiki/Tree_traversal
 */
public class TreeTraversal {

	public void inorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.println(node.value);
		inorderTraversal(node.right);
	}

	public void iterativeInorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode nd = node;
		while(!stk.isEmpty() || nd!= null){
			if(nd!= null){
				stk.push(nd);
				nd = nd.left;
			}else{
				nd = stk.pop();
				System.out.println(nd.value);
				nd = nd.right;
			}
		}
	}

	public void preorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		inorderTraversal(node.left);
		inorderTraversal(node.right);
	}

	public void iterativePreorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(node);
		while(!stk.empty()){
			TreeNode nd =stk.pop();
			System.out.println(node.value);
			 if (nd.right != null)
			      stk.push(node.right);
			    if (nd.left != null)
			      stk.push(node.left);
		}
	}

	public void postorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.println(node.value);
	}

	public void iterativePostorderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(node);
		while(!stk.empty()){
			
		}
	}

}
