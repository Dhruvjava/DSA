package com.cb.arrays.arrays01;

public class Arrays01 {

    public static void main(String[] args) {
        int[] array = new int[] {1, 8, 9, 7, 6, 8, 4, 3};
        int n = array.length;

        int ans = maxSumOfSubArray(array, n);

        System.out.println("Max Sum is : " + ans);
    }

    public static int maxSumOfSubArray(int[] array, int n) {
        int ans = Integer.MIN_VALUE;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                // find sum of sub array from start to end index
                int sum = 0;
                for (int i = s; i <= e; i++) {
                    sum = array[i];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

}
