package dsa.arrays;

import java.util.Scanner;
/*

Sort an array of 0s, 1s and 2s 

Easy 
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2
*/
public class SortAnArray0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortIt(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    private static void sortIt(int[] arr){
        int l = 0;
        int h = arr.length - 1;
        int mid = 0;
        while (mid <= h) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp;
                    l ++;
                    mid ++;
                    break;
                case 1:
                    mid ++;
                    break;
                default:
                    int tep = arr[h];
                    arr[h] = arr[mid];
                    arr[mid] = tep;
                    h --;
                    break;
            }
        }
    }
}
