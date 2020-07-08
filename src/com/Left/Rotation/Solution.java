package com.Left.Rotation;

import java.util.Scanner;

public class Solution{
    static long hourGlassSum(int[][] arr){
        long maxValue = Long.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                long temp = arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1] + arr[i+1][j] +arr[i+1][j-1] + arr[i+1][j+1];
                if (temp > maxValue) {
                    maxValue = temp;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] hourGlass = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                hourGlass[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(hourGlassSum(hourGlass));
    }
}