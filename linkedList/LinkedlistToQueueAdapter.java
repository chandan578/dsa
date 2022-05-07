package dsa.linkedList;

import java.util.Scanner;

import dsa.linkedList.AllSmallOperationOfLinkedlist.Linkedlist;

public class LinkedlistToQueueAdapter {
    public static void main(String[] args) {
        LLToQueueAdapter list = new LLToQueueAdapter();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.peek());
        System.out.println(list.size());
        for (int i = 0; i < n; i++) {
            list.remove();
        }
        System.out.println(list.size());
        sc.close();
    }
    public static class LLToQueueAdapter{
        Linkedlist list;
        public LLToQueueAdapter() {
            list = new Linkedlist();
        }
        int size() {
            return size();
            // write your code here
          }
      
          void add(int val) {
              list.addLast(val);
            // write your code here
          }
      
          void remove() {
              if (size() == 0) {
                  System.out.println("Queue  underflow");
              } else {
                  list.removeFirst();
              }
            // write your code here
          }
      
          int peek() {
            if (size() == 0) {
                System.out.println("Queue  underflow");
                return -1;
            } else {
               return list.getFirst();
            }
                         // write your code here
          }
    }
}
