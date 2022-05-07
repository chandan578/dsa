package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input ::

5

Output ::

             * 
          *  * 
       *  *  * 
    *  *  *  *
 *  *  *  *  * 
*/
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
