package dsa.dsa1.basic.start;

import java.util.Scanner;

/*
Print Fibonacci Numbers Till N
Easy 
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
Input Format
n
Output Format
0
1
1
2
3
5
8
.. first n fibonaccis

Constraints
1 <= n < 40
Sample Input
10
Sample Output
0
1
1
2
3
5
8
13
21
34
*/
public class PrintAllFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
