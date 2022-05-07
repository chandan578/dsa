package dsa.algorithms;

import java.util.Scanner;
/*

Binary search works only sorted array.
When we apply it unsorted then it fail.
Remember it....


Time complexity --  O(logn)
*/
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
        sc.close();
    }
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
