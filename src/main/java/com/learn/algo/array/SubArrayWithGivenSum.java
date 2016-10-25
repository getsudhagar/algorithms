package com.learn.algo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * O(n) using map work with positive/negative integers
 *
 */
public class SubArrayWithGivenSum {

	public List<Indexes> getSubarrywithSUm(int[] a, int k){
		Map<Integer,Integer> tmp = new HashMap<Integer,Integer>();
		List<Indexes>  idxList = new ArrayList<Indexes>();
		int curr_sum=0;
		int startIdx=0;
	    int endIdx=0;
		for(int i = 0;i<a.length;i++){
			curr_sum+=a[i];
			if(curr_sum==k){
				endIdx=i;
				Indexes idx = new Indexes(startIdx,endIdx);
				idxList.add(idx);
				break;
			}
			if(tmp.get(curr_sum-k)!= null ){
				startIdx =tmp.get(curr_sum-k)+1;
				endIdx=i;
				Indexes idx = new Indexes(startIdx,endIdx);
				idxList.add(idx);
				break;
			}
			tmp.put(curr_sum, i);
		}
		return idxList;
	}
}
