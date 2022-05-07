package dsa.dsa1.basic.start;

import java.util.Scanner;

/*
Digits Of A Number
Easy 
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number

Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3
*/
public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;
        while (temp>0) {
            temp /= 10;
            digit ++;
        }
        int div = (int) Math.pow(10, digit-1);
        while (div != 0) {
           System.out.println(num/div);
           num %= div;
           div /= 10;
        }
        sc.close();
    }    
}
