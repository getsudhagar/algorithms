package com.learn.algo.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a total and coins of certain denomination with infinite supply
 *  what is the number of coins it takes to form this total?
 *
 * Time complexity - O(coins.size * total)
 * Space complexity - O(coins.size * total)
 *
 */
public class CoinChange {
	
	public int numberOfSolutions(int[]coins,int total){
		int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int coinIdx=1; coinIdx <= coins.length; coinIdx++){
            for(int totalSub=1; totalSub <= total ; totalSub++){
                if(coins[coinIdx-1] >totalSub){
                    temp[coinIdx][totalSub] = temp[coinIdx-1][totalSub];
                }
                else{
                    temp[coinIdx][totalSub] = temp[coinIdx][totalSub-coins[coinIdx-1]] + temp[coinIdx-1][totalSub];
                }
            }
        }
        return temp[coins.length][total];
	}
	
	public int numberOfSolutionsSpaceEfficent(int[]coins,int total){
		int temp[] = new int[total+1];
		temp[0]=1;
		  for(int coinIdx=1; coinIdx <= coins.length; coinIdx++){
	            for(int totalSub=1; totalSub <= total ; totalSub++){
                if(coins[coinIdx-1] > totalSub){
                    temp[totalSub] += temp[totalSub-coins[coinIdx-1]];
                }
            }
        }
        return temp[total];
	}
	
	
	 public void printCoinChangingSolution(int total,int coins[]){
	        List<Integer> result = new ArrayList<Integer>();
	        printActualSolution(result, total, coins, 0);
	    }
	    
	    private void printActualSolution(List<Integer> result,int total,int coins[],int pos){
	        if(total == 0){
	            for(int r : result){
	                System.out.print(r + " ");
	            }
	            System.out.print("\n");
	        }
	        for(int i=pos; i < coins.length; i++){
	            if(total >= coins[i]){
	                result.add(coins[i]);
	                printActualSolution(result,total-coins[i],coins,i);
	                result.remove(result.size()-1);
	            }
	        }
	    }
 
  }
