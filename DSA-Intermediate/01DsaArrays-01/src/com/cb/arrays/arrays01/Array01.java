package com.cb.arrays.arrays01;

/**
 * Given Array of Size N, Count the number of elements having atlest one element greater than
 * itself. int[] arr  = new int[] {2, 5, 1, 4, 8, 0, 8, 1, 3, 8};
 * ans : 7 because 8 is greater element and there no element present greater than 8 and 8 present 3 times and total
 * elements are 10 so 10-3 = 7
 */

public class Array01 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 1, 4, 8, 0, 8, 1, 3, 8};

        int count = countOfGreateEle(arr);

        System.out.println("Number of count is :" + (arr.length - count));
    }

    public static int countOfGreateEle(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        return count;
    }
}
