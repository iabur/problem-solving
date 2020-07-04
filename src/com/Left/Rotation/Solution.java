package com.Left.Rotation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int reverseArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseArray(arr);
    }
}
