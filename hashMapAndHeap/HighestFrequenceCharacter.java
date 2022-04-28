package dsa.hashMapAndHeap;

import java.util.HashMap;
import java.util.Scanner;
/*
Highest Frequency Character
Easy
1. You are given a string str.
2. You are required to find the character with maximum frequency.
Input Format
A string str
Output Format
The character with highest frequency

Constraints
0 < str.length() <= 100
There will be a single character with highest frequency

Sample Input
zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
Sample Output
q
*/
public class HighestFrequenceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(highestFrequence(str));
        sc.close();
    }
    private static char highestFrequence(String str) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hMap.containsKey(ch)) {
                int val = hMap.get(ch);
                val ++;
                hMap.put(ch, val);
            } else {
                hMap.put(ch, 1);
            }
        }
        char mfc = str.charAt(0);
        for (Character key : hMap.keySet()) {
            if (hMap.get(key) > hMap.get(mfc)) {
                mfc = key;
            }
        }
        return mfc;
    }
}
