package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input ::
5

Output ::
       * 
    *  *  * 
 *  *  *  *  * 
    *  *  * 
       *
*/
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(" * ");
            }
            if (i <= n/2) {
                sp --;
                st += 2;
            } else {
                st -= 2;
                sp ++;
            }
            System.out.println();
        }
        sc.close();
    }
}
