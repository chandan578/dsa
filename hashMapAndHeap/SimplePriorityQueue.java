package dsa.hashMapAndHeap;


import java.util.Collections;
import java.util.PriorityQueue;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer>  pq = new PriorityQueue<Integer>();
        /* Using priority queue we can sort any array in O(nlogn)
            It takes O(nlogn) because add() takes O(logn) time

            using this data structure we can reverse any arr...
        */
        PriorityQueue<Integer>  pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        // when we define Collections.reverseOrder() then reverse an array..

        int[] ranks = {22, 99, 3, 11, 88, 4, 1};
        
        for (int val : ranks) {
            pq.add(val);
        }

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
