package dsa.dsa1.basic.start;

import java.util.Scanner;

/*
Print All Primes Till N
Easy
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Input Format
low 
high
Output Format
n1
n2
.. all primes between low and high (both included)

Constraints
2 <= low < high < 10 ^ 6
Sample Input
6 
24
Sample Output
7
11
13
17
19
23
*/
public class PrintAllPrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        while (low <= high) {
            int count = 0;
            for (int i = 2; i*i <= low; i++) {
                if (low % i == 0) {
                    count ++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(low);
            }
            low ++;
        }
        sc.close();
    }    
}
