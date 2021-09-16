package com.company;

public class Task2 {
    public static int solution(int[][] arr) {

        int count = arr.length*arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (((i-1)>=0 && arr[i][j] == arr[i - 1][j])) {
                    count--;
                }
                if (((j-1)>=0 && arr[i][j] == arr[i][j - 1])){
                    count--;
                }
            }
        }
        return count;
    }
}
