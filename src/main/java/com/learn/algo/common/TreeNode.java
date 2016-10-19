package com.learn.algo.common;

public class TreeNode {

  public int value;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int value) {
	  this.value =value;
  }
  
  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
