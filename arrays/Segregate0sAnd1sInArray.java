package dsa.arrays;

import java.util.Scanner;
/*
Segregate 0s and 1s 
Easy
Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.

Example 1:

Input:
N = 5
arr[] = {0, 0, 1, 1, 0}
Output: 0 0 0 1 1

Example 2:

Input:
N = 4
Arr[] = {1, 1, 1, 1}
Output: 1 1 1 1
Explanation: There are no 0 in the given array, 
so the modified array is 1 1 1 1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 107
0 ≤ arri ≤ 1
*/
public class Segregate0sAnd1sInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort0sAnd1s(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static void sort0sAnd1s(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (arr[l] == 0) {
                l++;
            } else if (arr[r] == 1) {
                r--;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }
    }
}
