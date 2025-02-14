package com.cb.arrays.arrays01;

public class Array01 {
    public static void main(String[] args) {
        int[] arr = new int[] {-3, -2, 6, 8, 4, 8, 5};

        int count = countOfGreateEle(arr);

        System.out.println("Number of count is :" + count);
    }

    public static int countOfGreateEle(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
