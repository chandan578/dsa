package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Key Pair 
Easy
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105
*/
public class CheckForPairInArrayWithSumAsX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(pairOfSum(arr, n, sum));
        sc.close();
    }

    private static boolean pairOfSum(int[] arr, int n, int x) {
        int l = 0;
        int r = n - 1;
        Arrays.sort(arr);
        while (l < r) {
            if (arr[l] + arr[r] == x) {
                return true;
            } else if (arr[l] + arr[r] < x) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }
}
// private static int[] pairOfSum(int[] arr, int sum) {
// int l = 0;
// int r = n-1;
// Arrays.sort(arr);
// while (l< r) {
// if (arr[l] + arr[r] == x) {
// return new int[] {arr[i], arr[i+1]};
// } else if (arr[l] + arr[r] < x) {
// l++;
// } else {
// r--;
// }
// }
// return new int[] {0};
// }

// 6 16
// 1 4 45 6 10 8
// 5 4
// 1 2 5 6 7