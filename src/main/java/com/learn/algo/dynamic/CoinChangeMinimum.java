package com.learn.algo.dynamic;

import java.util.Map;

/**
 * Given a total and coins of certain denomination with infinite supply what is
 * the minimum number of coins it takes to form this total?
 *
 * Time complexity - O(coins.size * total) Space complexity - O(coins.size *
 * total)
 *
 */
public class CoinChangeMinimum {

	public int solveUsingBottomUpApproch(int[] coins, int total) {
		int temp[] = new int[total + 1];
		int R[] = new int[total + 1];
		for (int i = 1; i <= total; i++) {
			temp[i] = Integer.MAX_VALUE - 1;
			R[i] = -1;
		}
		temp[0] = 0;
		for (int coinIdx = 1; coinIdx <= coins.length; coinIdx++) {
			for (int totalSub = 1; totalSub <= total; totalSub++) {
				if (coins[coinIdx - 1] > totalSub) {
					if (temp[totalSub - coins[coinIdx - 1]] + 1 < temp[totalSub - 1]) {
						temp[totalSub] = temp[totalSub - coins[coinIdx - 1]] + 1;
						R[totalSub] = coinIdx;
					}

				}
			}
		}
		printCoinCombination(R, coins);
		return temp[total];
	}

	private void printCoinCombination(int R[], int coins[]) {
		if (R[R.length - 1] == -1) {
			System.out.print("No solution is possible");
			return;
		}
		int start = R.length - 1;
		System.out.print("Coins used to form total ");
		while (start != 0) {
			int j = R[start];
			System.out.print(coins[j] + " ");
			start = start - coins[j];
		}
		System.out.print("\n");
	}
	
	
    /**
     * Map for memorization of intermediate values
     * @param total
     * @param coins
     * @param map
     * @return
     */
	public int solveUsingtopDownApproch(int total, int coins[], Map<Integer, Integer> map) {

		// if total is 0 then there is nothing to do. return 0.
		if (total == 0) {
			return 0;
		}

		// if map contains the result means we calculated it before. Lets return
		// that value.
		if (map.containsKey(total)) {
			return map.get(total);
		}

		// iterate through all coins and see which one gives best result.
		int min = Integer.MAX_VALUE;
		for (int coinIdx = 0; coinIdx < coins.length; coinIdx++) {
			// if value of coin is greater than total we are looking for just
			// continue.
			if (coins[coinIdx] > total) {
				continue;
			}
			// recurse with total - coins[i] as new total
			int val = solveUsingtopDownApproch(total - coins[coinIdx], coins, map);

			// if val we get from picking coins[i] as first coin for current
			// total is less
			// than value found so far make it minimum.
			if (val < min) {
				min = val;
			}
		}

		// if min is MAX_VAL dont change it. Just result it as is. Otherwise add
		// 1 to it.
		min = (min == Integer.MAX_VALUE ? min : min + 1);

		// memoize the minimum for current total.
		map.put(total, min);
		return min;
	}

}
