package dsa.arrays;

import java.util.Scanner;

public class MinDistBetTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }        
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(minimumDistance(arr, x, y));
        sc.close();
    }
    private static int minimumDistance(int[] arr, int x, int y) {
        int n = arr.length;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == x || arr[i] == y) {
                for (int j = i+1; j < n; j++) {
                    if ((arr[j] == x || arr[j] == y) && diff > Math.abs(i - j) ) {
                        diff = Math.abs(i-j);
                        break;
                    }
                }
            }
        }
        return diff;
    }
}