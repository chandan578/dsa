package dsa.dsa1.basic.pattern;

import java.util.Scanner;
/*
Input : 
5

Output :
1                       1  
1  2                 2  1
1  2  3           3  2  1
1  2  3  4     4  3  2  1  
1  2  3  4  5  4  3  2  1
*/
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2*n-3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(j+"  ");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("   ");
            }
            for (int j = st; j >= 1; j--) {
                if (j != n) { 
                    System.out.print(j + "  ");
                }
            }
            sp -= 2;
            st ++;
            System.out.println();
        }
        sc.close();
    }
}
