package Collection_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Learn_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()) ;
        pq.offer(40) ;
        pq.offer(50) ;
        pq.offer(90) ;
        pq.offer(20) ;


        System.out.println(pq);
        pq.poll() ;
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
