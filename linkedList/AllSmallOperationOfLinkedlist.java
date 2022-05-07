package dsa.linkedList;

import java.util.Scanner;
/*
Normal operation on linked list
1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
    2.10. removeLast - removes the last element of linked list.
    2.11. removeAt - remove an element at a given index
3. You are required to complete the body of reversePI function. The function should be an iterative function and should reverse the contents of linked list by changing the "next" property of nodes.
4. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you

*/
public class AllSmallOperationOfLinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linkedlist list = new Linkedlist();
        for (int i = 0; i < n; i++) {
            list.addFirst(sc.nextInt());
        }
        // list.addLast(500);
        // list.addAt(2, 200);
        list.display();
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        list.removeAt(3);
        // list.display();
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
        // System.out.println(list.getAt(2));
        // list.reverse();
        list.reversePI();
        list.display();
        System.out.println(list.size());
        sc.close();
    }

    private static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        // Add first in linked list
        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        // Add last in linked list
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // Add at index in the linked list
        void addAt(int idx, int val) {
            if (idx == 0) {
                addFirst(val);
            } else if (idx > 0 || idx < size) {
                Node node = new Node();
                node.data = val;
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            } else if (idx == size) {
                addLast(val);
            } else {
                System.out.println("Invalid argument.");
            }
        }

        // calculate size of a linkedlist
        int size() {
            return size;
        }

        // display a linked list
        void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        // remove first from linked list
        void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty.");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        // Remove last node from linked list
        void removeLast() {
            if (size == 0) {
                System.out.println("List is empty.");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                size--;
            }
        }
        // Remove a node at index from linked list
        void removeAt(int idx){
            if (idx == 0) {
                removeFirst();
            } else if (idx == size -1) {
                removeLast();
            } else if (idx <0 || idx >= size) {
                System.out.println("Invalid argument");
            } else {
                Node temp = head;
                for (int i = 0; i < idx-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size --;
            }
        }

        // get first value
        int getFirst() {
            if (size == 0) {
                System.out.println("List is empty.");
                return -1;
            } else {
                return head.data;
            }
        }

        // get last value
        int getLast() {
            if (size == 0) {
                System.out.println("List is empty.");
                return -1;
            } else {
                return tail.data;
            }
        }

        // get at index value
        int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty.");
                return -1;
            } else if (idx >= size || idx < 0) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        // Reverse a linked list using data and iterative method
        private Node getNode(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        void reverse() {
            int start = 0;
            int end = size - 1;
            while (start < end) {
                Node left = getNode(start);
                Node right = getNode(end);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                start++;
                end--;
            }
        }

        // Reverse linked list using pointer iterative
        void reversePI() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

    }
}
