package November.ex_21112024_Collection_Set;

import java.util.PriorityQueue;

public class Queue_ex1 {
    public static void main(String[] args) {

        /* Queue - priority Queue
          - Rarely used in Automation 0.01%
          - FIFO - First In First Out
          - offer, peek, poll
          - null not allowed
         */
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");  //add
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());  //1st element
        System.out.println(pq.poll());  //remove 1st element
        System.out.println(pq);
    }
}
