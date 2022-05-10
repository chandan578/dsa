package dsa.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorElement(arr));
        sc.close();
    }
    private static int majorElement(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = arr.length;
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
            if (hmap.get(i) >= n/2) {
                return i;
            }
        }
        return -1;

    }
}
