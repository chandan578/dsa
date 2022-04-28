package dsa.hashMapAndHeap;

import java.util.HashMap;
import java.util.Scanner;
/*
Get Common Elements - 2
Easy  
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted. Check out the question video.
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
All relevant elements of intersection in separate lines
The elements of intersection should be printed in order of their occurence in a2.
Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
Time complexity should be O(n)
Sample Input
7
1 1 2 2 2 3 5
7
1 1 1 2 2 4 5
Sample Output
1 1 2 2 5
*/
public class GetElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        commanElement(arr1, arr2);
        sc.close();
    }
    private static void commanElement(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int key : arr1) {
            if (hMap.containsKey(key)) {
                int val = hMap.get(key);
                val ++;
                hMap.put(key, val);
            } else {
                hMap.put(key, 1);
            }
        }
        for (int key : arr2) {
            if (hMap.containsKey(key) && hMap.get(key) > 0) {
                System.out.print(key + " ");
                int val = hMap.get(key);
                val --;
                hMap.put(key, val);
            }
        }
    }
}
