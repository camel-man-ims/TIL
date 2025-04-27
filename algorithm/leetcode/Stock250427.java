package algorithm.leetcode;

/**
 * 최소값과
 * 최대이익을 찾는 문제
 */

public class Stock250427 {
    public static void main(String[] args) {
        int [] prices = {7, 1, 5, 3, 6, 4};

        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i =0; i< prices.length ; i++){
            if(prices[i] < minValue) {
                minValue = prices[i];
            }

            maxProfit = Integer.max(maxProfit, prices[i] - minValue);
        }

        System.out.println(maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            }

            maxProfit = Integer.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }
}