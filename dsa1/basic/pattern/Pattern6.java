package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input :

5

Output :
 *  *  *     *  *  * 
 *  *           *  *
 *                 * 
 *  *           *  *
 *  *  *     *  *  *
*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 1;
        int st = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(" * ");
            }
            if (i <= n/2) {
                sp += 2;
                st --;
            } else {
                sp -= 2;
                st ++;
            }
            System.out.println();
        }
        sc.close();
    }
}
