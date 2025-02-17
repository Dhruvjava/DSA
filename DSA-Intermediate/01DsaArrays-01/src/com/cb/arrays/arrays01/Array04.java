package com.cb.arrays.arrays01;

public class Array04 {

    public static void main(String[] args) {
        int[] a = new int[] {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        int start = 3;
        int end = 7;
        a = reverseSiAndSj(a, start, end);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    public static int[] reverseSiAndSj(int[] a, int start, int end) {
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
        return a;
    }

    private static void swap(int[] a, int start, int end) {
        a[start] = a[start] + a[end];
        a[end] = a[start] - a[end];
        a[start] = a[start] - a[end];
    }

}
