package dsa.hashMapAndHeap;

import java.util.PriorityQueue;
import java.util.Scanner;
/*
K Largest Elements
Medium
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. You are required to find and print the k largest elements of array in increasing order.
Input Format
Input is managed for you
Output Format
Print the k largest elements of array in increasing order in separate lines.
Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 100
0 < k <= n
Sample Input
12
13 12 62 22 15 37 99 67 31 84 99 4
4
Sample Output
67 84 99 99 
*/
public class KLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        kLargestElement(arr, k);
        sc.close();
    }
    private static void kLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size() > 0){
            System.out.print(pq.remove() + " ");
        }
    }
}
