package com.cb.arrays.arrays01;

/**
 * find the pairs of i and j which sum should be k
 * where i & j is not equal
 *
 * Asked in Amazon and VmWare
 */

public class Array02 {

    public static void main(String[] args) {
        int[] a = new int[] {3, -2, 1, 4, 3, 6, 8};
        int k = 10;
        boolean pairExists = sumOfTwoPairsExists(a, k);
        System.out.println("Sum of Pains equals to k is exists : " + pairExists);
    }

    public static boolean sumOfTwoPairsExists(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i != j && arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
