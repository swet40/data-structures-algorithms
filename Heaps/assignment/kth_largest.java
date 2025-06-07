package assignment;

import java.util.*;

public class kth_largest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public kth_largest(int k, int[] nums){
        this.k = k;
        pq = new PriorityQueue<>();
        for(int num:nums){
            add(num);
        }
    }
    public int add(int val){
        if(pq.size() < k || val > pq.peek()){
            pq.offer(val);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        kth_largest kthLargest = new kth_largest(3,new int[]{4,5,8,2});

        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
