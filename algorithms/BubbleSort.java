package dsa.algorithms;

import java.util.Scanner;
/*
Write an array sorting program using bubble sort.

Bubble sort is a simple sorting algorithm that compares adjacent elements of an array and swaps them if the element on the right is smaller than the one on the left. It is an in-place sorting algorithm i.e. no extra space is needed for this sort, the array itself is modified.


Time complexity of bubble sort --  O(n*n)
*/
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
    }
}
