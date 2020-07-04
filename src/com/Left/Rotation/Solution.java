package com.Left.Rotation;



import java.util.Date;
import java.util.Scanner;

public class Solution{
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");
        String[] aItems = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[(d+i) % n] + " ");
        }
        scanner.close();
    }
}