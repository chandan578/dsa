package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTripletInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(triplet(arr));
        sc.close();
    }
    private static boolean triplet(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i]*arr[i] + arr[i+1]*arr[i+1]) == arr[i+2]*arr[i+2]) {
                return true;
            }
        }
        return false;
    }
}
/*
61
42 12 54 69 48 45 63 58 38 60 24 42 30 79 17 36 91 43 89 7 41 43 65 49 47 6 91 30 71 51 7 2 94 49 30 24 85 55 57 41 67 77 32 9 45 40 27 24 38 39 19 83 30 42 34 16 40 59 5 31 78
*/