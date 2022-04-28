package dsa.hashMapAndHeap;

import java.util.PriorityQueue;
import java.util.Scanner;
/*
Sort K-sorted Array
Easy  
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. The array is nearly sorted. Every element is at-max displaced k spots left or right to it's position in the sorted array. Hence it is being called k-sorted array.
4. You are required to sort and print the sorted array.

Note -> You can use at-max k extra space and nlogk time complexity.
Input Format
Input is managed for you
Output Format
Print the elements of sorted array in separate lines.
Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 100
0 < k <= n
Sample Input
9
3 2 4 1 6 5 7 9 8
3

Output
1 2 3 4 5 6 7 8 9 

*/
public class SortANearlySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sortNearlySorted(arr, k);
        sc.close();
    }
    private static void sortNearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k+1; i < arr.length; i++) {
            System.out.print(pq.remove() + " ");
            pq.add(arr[i]);
        }
        while (pq.size() > 0){
            System.out.print(pq.remove() + " ");
        }
    }
}
