package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input :
9

Output : 
 *  *  *  *  *  *  *  *  * 
    *                 * 
       *           * 
          *     * 
             * 
          *  *  * 
       *  *  *  *  * 
    *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
*/
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= st; j++) {
                if (i <= n/2 && i > 1 && j > 1 && j < st ) {
                    System.out.print("   ");
                } else {
                    
                    System.out.print(" * ");
                }
            }
            if (i <= n/2) {
                sp ++;
                st -= 2;
            } else {
                sp --;
                st += 2;
            }
            System.out.println();

        }
        sc.close();
    }
}
