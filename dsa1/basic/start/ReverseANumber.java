package dsa.dsa1.basic.start;

import java.util.Scanner;

/*
Reverse A Number
Easy  
1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number in reverse
Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
3
8
3
4
8
7
5
6
*/
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
        sc.close();
        
    }    
}
