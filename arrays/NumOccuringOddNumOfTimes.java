package dsa.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class NumOccuringOddNumOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(oddNumberOfTimes(arr));
        sc.close();
    }

    // It is also best its
                // Time complexity --> O(n)
                // but its takes extra space for hashing  
    private static int oddNumberOfTimes(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : arr) {
            if (hmap.containsKey(i)) {
                int val = hmap.get(i);
                val ++;
                hmap.put(i, val);
            } else {
                hmap.put(i, 1);
            }
        }
        for (int i : arr) {
            if (hmap.get(i) % 2 != 0) {
                return i;
            }
        }
        return -1;
    }


    // It is best because its 
            // Time complexity -->  O(n)
            // Space complexity --> O(1)   , It takes no extra space.

    // private static int oddNumberOfTimes(int[] arr) {
    //     int res = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         res ^= arr[i];
    //     }
    //     return res;
    // }
}
