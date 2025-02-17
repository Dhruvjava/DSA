package com.cb.arrays.arrays01;

public class Array05 {

    public static void main(String[] args) {
        int[] a = new int[] {-2, 3, 1, 4, 6, 2, 8, 7, 9, 3};
        int k = 3;
        //        a = reverseArray(a);
        a = rotateArrayWithK(a, k);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    private static int[] rotateArrayWithK(int[] a, int k) {
        int start = 0;
        int end = k - 1;
        a = reversePart(a, start, a.length - 1);
        start = 0;
        end = k - 1;
        a = reversePart(a, start, end);
        start = k;
        end = a.length - 1;
        a = reversePart(a, start, end);
        return a;
    }

    public static int[] reversePart(int[] a, int start, int end) {
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
        return a;
    }

    public static void swap(int[] a, int start, int end) {
        a[start] = a[start] + a[end];
        a[end] = a[start] - a[end];
        a[start] = a[start] - a[end];
    }

}
