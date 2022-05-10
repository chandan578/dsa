package dsa.arrays;

import java.util.Scanner;

public class FixedPointInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fixedPoint(arr));
        sc.close();
    }

    // // Its time complexity is O(n)
    // private static int fixedPoint(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == i){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Its time complexity is O(logn)
    private static int fixedPoint(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (mid == arr[mid]) {
                return mid;
            } else if(mid > arr[mid]) {
                low = mid + 1;
            } else{
                high = mid - 1;   
            }
        }
        return -1;
    }
}
