package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input :
5

Output :
             * 
          * 
       * 
    * 
 * 
*/
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print("   ");
            }
            System.out.print(" * ");
            System.out.println();
        }
        sc.close();
    }
}
