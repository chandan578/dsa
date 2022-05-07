package dsa.hashMapAndHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
Merge K Sorted Lists
Hard
1. You are given a list of lists, where each list is sorted.
2. You are required to complete the body of mergeKSortedLists function. The function is expected to merge k sorted lists to create one sorted list.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
Space complextiy = O(k)
Time complexity = nlogk
where k is the number of lists and n is number of elements across all lists.
Sample Input
4
5
10 20 30 40 50
7
5 7 9 11 19 55 57
3
1 2 3
2
32 39
Sample Output
1 2 3 5 7 9 10 11 19 20 30 32 39 40 50 55 57 
*/
public class MergeKSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            lists.add(list);
        }
        ArrayList<Integer> mlist = mergekSortedlList(lists);
        System.out.println(mlist);
        sc.close();
    }
    public static class Pair implements Comparable<Pair> {
        int li;
        int di;
        int val;
        Pair(int li, int di, int val){
            this.li = li;
            this.di = di;
            this.val = val;
        }
        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return this.val - o.val;
        }
    }
    private static ArrayList<Integer> mergekSortedlList(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < lists.size(); i++) {
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }
        while (pq.size() > 0) {
            Pair p = pq.remove();
            rv.add(p.val);
            p.di ++;
            if (p.di < lists.get(p.li).size()){
                p.val = lists.get(p.li).get(p.di);
                pq.add(p);
            }
        }
        return rv;
    }
}
