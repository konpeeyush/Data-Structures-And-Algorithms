package Collection_Framework;

import java.util.ArrayDeque;

public class Learn_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>() ;
        dq.offer(10) ;
        dq.offer(20) ;
        dq.offer(30) ;
        dq.offerFirst(100) ;
        dq.offerLast(500) ;
        System.out.println(dq);
        //Similarly, we can use peek first and peek last

    }
}
