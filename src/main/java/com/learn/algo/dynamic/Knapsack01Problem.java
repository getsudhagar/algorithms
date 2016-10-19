package com.learn.algo.dynamic;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * 0/1 Knapsack Problem - Given items of certain weights with values choose
 * items so as to get a given capacity (weight) and maximize sum of value of
 * items
 * 
 * Time complexity - O(capacity*total items)
 * 
 **/
public class Knapsack01Problem {

	public Knapsack01ProblemResult solveUsingBottomUpApproch(int[] values, int[] weights, int capacity) {
		int[][] subProbs = new int[values.length + 1][capacity + 1];
		for (int i = 0; i <= values.length; i++) {
			for (int j = 0; j <= capacity; j++) {
				if (i == 0 || j == 0) {
					subProbs[i][j] =0;
					continue;
				}
				if (j - weights[i - 1] >= 0) {
					int prev = subProbs[i - 1][j];
					int current = subProbs[i - 1][j - weights[i - 1]]+ values[i - 1];
					if(current>prev){
						subProbs[i][j]=current;
					}else{
						
						subProbs[i][j]=prev;
					}
				} else {
					subProbs[i][j] = subProbs[i - 1][j];
				}
			}
		}
		Knapsack01ProblemResult result = new Knapsack01ProblemResult();
		//result.setMaxValue(subProbs[values.length][capacity].getUptoRelizedValue());
		return result; //;
	}

	public int solveUsingTopDownApproch(int[] values, int[] weights, int capacity) {
		//map of key(remainingWeight, remainingCount) to maximumValue they can get. memorization for DP.
        Map<Index, Integer> map = new HashMap<Index, Integer>();
        return topDownRecursive(values, weights, capacity, values.length, 0, map);
    }

	class Index {
        int remainingWeight;
        int remainingItems;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Index index = (Index) o;

            if (remainingWeight != index.remainingWeight) return false;
            return remainingItems == index.remainingItems;

        }

        @Override
        public int hashCode() {
            int result = remainingWeight;
            result = 31 * result + remainingItems;
            return result;
        }
    }
	
    public int topDownRecursive(int values[], int weights[], int capacity, int totalItems, int currentItem, Map<Index, Integer> map) {
        //if currentItem exceeds total item count or remainingWeight is less than 0 then
        //just return with 0;
        if(currentItem >= totalItems || capacity <= 0) {
            return 0;
        }

        //fom a key based on remainingWeight and remainingCount
        Index key = new Index();
        key.remainingItems = totalItems - currentItem -1;
        key.remainingWeight = capacity;

        //see if key exists in map. If so then return the maximumValue for key stored in map.
        if(map.containsKey(key)) {
            return map.get(key);
        }
        int maxValue;
        //if weight of item is more than remainingWeight then try next item by skipping current item
        if(capacity < weights[currentItem]) {
            maxValue = topDownRecursive(values, weights, capacity, totalItems, currentItem + 1, map);
        } else {
            //try to get maximumValue of either by picking the currentItem or not picking currentItem
            maxValue = Math.max(values[currentItem] + topDownRecursive(values, weights, capacity - weights[currentItem], totalItems, currentItem + 1, map),
                    topDownRecursive(values, weights, capacity, totalItems, currentItem + 1, map));
        }
        //memorize the key with maxValue found 
        map.put(key, maxValue);
        return maxValue;

	}

}
