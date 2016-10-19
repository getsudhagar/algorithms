package com.learn.algo.dynamic;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {

     /**
      * 	
      * @param input
      * @param total
      * @return
      */
	 public boolean subsetSumBottomApproch(int input[], int total) {

	        boolean T[][] = new boolean[input.length + 1][total + 1];
	        for (int i = 0; i <= input.length; i++) {
	            T[i][0] = true;
	        }

	        for (int i = 1; i <= input.length; i++) {
	            for (int j = 1; j <= total; j++) {
	                if (j - input[i - 1] >= 0) {
	                    T[i][j] = T[i - 1][j] || T[i - 1][j - input[i - 1]];
	                } else {
	                    T[i][j] = T[i-1][j];
	                }
	            }
	        }
	        return T[input.length][total];

	    }

	 /**
	  * All Possible combinations !! No Just One like above solution 
	  * @param values
	  * @param sum
	  * @return
	  */
	public List<ArrayList<Integer>> solveTopDownApproch(int[] values, int sum) {
		List<ArrayList<Integer>> kp = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> k = new ArrayList<Integer>();
		int position=0;
		int countIdx = values.length-1;
		int uptoSum =0;
		int intermediateSum= 0;
		for(int i=0;i<values.length-1;i++){
			int tmp =values[0];
			values[0]=values[i];
			values[0]=tmp;
			solve(values,k,position,countIdx,sum,intermediateSum,uptoSum);
			if(!k.isEmpty()){
				kp.add(k);
			}
		}
		return kp;
	}

	private void solve(int[] values, List<Integer> k, int position,int countIdx,int sum ,int intermediateSum, int uptoSum) {
		if(uptoSum == sum){
			return;
		}
		if(position<=countIdx && intermediateSum<sum){
			int currentValue = values[position];
			if(currentValue<=sum){
				k.add(currentValue);
				solve(values,k,position+1,countIdx,sum,sum-currentValue,uptoSum+currentValue);
			}else{
				solve(values,k,position+1,countIdx,sum,sum,uptoSum);
			}
			
		}
		
	}

}
