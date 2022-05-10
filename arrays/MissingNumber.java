package dsa.arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
        sc.close();
    }
    private static int missingNumber(int[] arr){
        int sum = 0;
        int n = arr.length + 1;
        for (int i : arr) {
            sum += i;
        }
        return n*(n+1)/2 -sum;
    }
}
