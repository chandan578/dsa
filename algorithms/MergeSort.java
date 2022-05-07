package dsa.algorithms;

import java.util.Scanner;
/*
Merge sort algorithm...

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then it merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. See the following C implementation for details.

MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)


Time complexity = O(nlogn)
*/
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n -1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    private static void divide(int[] arr, int sIdx, int eIdx) {
        if (sIdx >= eIdx) {
            return;
        }
        int mid = sIdx + (eIdx - sIdx)/2;
        divide(arr, sIdx, mid);
        divide(arr, mid + 1, eIdx);
        conquer(arr, sIdx, mid, eIdx);
    }
    private static void conquer(int[] arr, int sIdx, int mid, int eIdx) {
        int[] merged = new int[eIdx - sIdx + 1];
        int idx1 = sIdx;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= eIdx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid)
            merged[x++] = arr[idx1++];
        while(idx2 <= eIdx)
            merged[x++] = arr[idx2++];

        for (int i = 0, j = sIdx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
