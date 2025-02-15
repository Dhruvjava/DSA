package com.cb.arrays.arrays01;

import java.util.stream.IntStream;

/**
 * Gievn an Array of size N, Reverse Array expected Time Complexity O(1) Asked in : Amazon,
 * Microsoft
 */

public class Array03 {

    public static void main(String[] args) {

        int[] a = new int[] {-1, 6, 3, 2, 8, 9, 10};
        a = reverseArray(a);
        System.out.print("{ ");
        IntStream.of(a).forEach(val -> System.out.print(val + " "));
        System.out.print("}");

    }

    public static int[] reverseArray(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            a[start] = a[start] + a[end];
            a[end] = a[start] - a[end];
            a[start] = a[start] - a[end];
            start++;
            end--;
        }
        return a;
    }

}
