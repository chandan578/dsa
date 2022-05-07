package dsa.linkedList;

import java.util.Scanner;

/*
Linked List To Stack Adapter
Easy 
1. You are required to complete the code of our LLToStackAdapter class. 
2. As data members, you've a linkedlist available in the class.
3. Here is the list of functions that you are supposed to complete
    3.1. push -> Should accept new data in LIFO manner
    3.2. pop -> Should remove and return data in LIFO manner. If not 
     available, print "Stack underflow" and return -1.
    3.3. top -> Should return data in LIFO manner. If not available, print 
    "Stack underflow" and return -1.
    3.4. size -> Should return the number of elements available in the 
    stack
4. Input and Output is managed for you.

Note -> The intention is to use linked list functions to achieve the purpose of a stack. All the functions should work in constant time.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
None
Sample Input
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit
Sample Output
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10

*/

import dsa.linkedList.AllSmallOperationOfLinkedlist.Linkedlist;

public class LinkedlistToStackAdapter {
    public static void main(String[] args) {
        LLToStackAdapter list = new LLToStackAdapter();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.push(sc.nextInt());
        }
        System.out.println(list.top());
        System.out.println(list.size());
        for (int i = 0; i < n; i++) {
            list.pop();
        }
        System.out.println(list.size());
        sc.close();
    }
    public static class LLToStackAdapter {
        Linkedlist list;
    
        public LLToStackAdapter() {
          list = new Linkedlist();
        }
    
    
        int size() {
            return list.size();
        }
    
        void push(int val) {
            list.addFirst(val);
        }
    
        void pop() {
            if (size() == 0) {
                System.out.println("Stack underflow");  
            } else {
                list.removeFirst();
            }
        }
    
        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;  
            } else {
                return list.getFirst();
            }
        }
      }

}
