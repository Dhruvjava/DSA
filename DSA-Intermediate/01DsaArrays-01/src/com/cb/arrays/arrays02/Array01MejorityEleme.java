package com.cb.arrays.arrays02;

public class Array01MejorityEleme {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 3, 6, 1, 3, 2, 5, 3, 3, 3};
        int n = arr.length;
        int me = findMejorityElement(arr, n);
        System.out.println("Mejority Element : " + me);
    }

    private static int findMejorityElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

}
