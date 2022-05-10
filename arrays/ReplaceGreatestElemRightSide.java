package dsa.arrays;

import java.util.Scanner;

public class ReplaceGreatestElemRightSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        replaceElement(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        sc.close();
    }
    private static void replaceElement(int[] arr) {
        int n = arr.length;
        int prev = arr[n-1];
        arr[n-1] = -1;
        for (int i = n-2; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = prev;
            if (curr > prev) {
                prev = curr;
            }
        }
    }
}
