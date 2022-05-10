package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersOfAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = leaderElement(arr);
        System.out.println(list);
        sc.close();
    }
    private static List<Integer> leaderElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        list.add(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        return list;
    }
}
