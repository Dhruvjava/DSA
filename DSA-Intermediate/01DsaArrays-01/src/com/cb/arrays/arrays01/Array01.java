package com.cb.arrays.arrays01;

public class Array01 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 1, 4, 8, 0, 8, 1, 3, 8};

        int count = countOfGreateEle(arr);

        System.out.println("Number of count is :" + count);
    }

    public static int countOfGreateEle(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<n;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++){
            if (arr[i] == max){
                count++;
            }
        }
        return count;
    }
}
