package dsa.hashMapAndHeap;

import java.util.HashMap;
import java.util.Scanner;
/*
Longest Consecutive Sequence Of Elements
Hard 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)
Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 15
Sample Input
17
12 5 1 2 10 2 13 7 11 8 9 11 8 9 5 6 11

Output
5 6 7 8 9 10 11 12 13 
*/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestSequence(arr);   
        sc.close();
    }
    private static void longestSequence(int[] arr) {
        HashMap<Integer, Boolean> hMap = new HashMap<>();
        for (int val : arr) {
            hMap.put(val, true);
        }

        for (int val : arr) {
            if (hMap.containsKey(val - 1)) {
                hMap.put(val,false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val : arr) {
            if (hMap.containsKey(val) == true) {
                int tl = 1;
                int tsp = val;
                while (hMap.containsKey(tl + tsp)) {
                    tl ++;
                }
                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for (int i = 0; i < ml; i++) {
            System.out.print(msp + i + " ");
        }
    }
}
