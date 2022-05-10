package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Peak element 
Easy
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.

Can you solve the problem in expected time complexity?

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Not full fill this expected result.....

Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106
*/
public class PeakElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = peak(arr);
        System.out.println(list);
        sc.close();
    }
    private static List<Integer> peak(int[] arr){
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        if (arr[0] > arr[1]) {
            list.add(arr[0]);
        }
        if(arr[n-1] > arr[n-2]){
            list.add(arr[n-1]);
        }
        for (int i = 1; i < n-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
