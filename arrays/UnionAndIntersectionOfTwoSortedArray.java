package dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UnionAndIntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i ++)
            arr1[i] = sc.nextInt();
        int n2= sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i= 0; i < n2; i ++)
            arr2[i] = sc.nextInt();
        
        List<Integer> uList = union(arr1, arr2);
        System.out.println(uList);
        List<Integer> list = intersection(arr1, arr2);
        System.out.print(list);
        sc.close();

    }
    private static List<Integer> union(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : arr1) {
            hmap.put(i, 1);
        }
        for (int i : arr2) {
            hmap.put(i, 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : hmap.keySet()) {
            list.add(i);
        }
        return list;
        
    }
    private static List<Integer> intersection(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i : arr1){
            hmap.put(i, 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : arr2){
            if(hmap.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}
