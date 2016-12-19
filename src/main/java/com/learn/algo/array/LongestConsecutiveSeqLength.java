package com.learn.algo.array;

import java.util.HashSet;

/**
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence. For example, given [100, 4, 200, 1, 3, 2, 6,
 * 7, 9], the longest consecutive elements sequence should be [1, 2, 3, 4] Its
 * length is 4.
 */
public class LongestConsecutiveSeqLength {
	
	public int findLongestConsecutiveSeqLength(int [] elements){
	   HashSet<Integer>  uniqElements = new  HashSet<Integer>();
       int lastLongestLength = 0;
       int n = elements.length;
       for(int i =0;i<n;i++){
           uniqElements.add(elements[i]);
       }
       for(int i =0;i<n;i++){
           if(!uniqElements.contains(elements[i]-1)){
               int j = elements[i];
               // check for sequence
               while(uniqElements.contains(elements[j]))
               j++;
               
               // update present length
               if(lastLongestLength<j-elements[i])
               lastLongestLength = j-elements[i];
           }
        }
	   
	   return lastLongestLength;
   }
}
