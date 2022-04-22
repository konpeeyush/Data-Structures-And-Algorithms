package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class Learn_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>() ;
        queue.offer(10) ;
        queue.offer(20) ;
        queue.offer(30) ;

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
//
//        Queue<Integer> q=new LinkedList<Integer>();
//        for(int i=1;i<5;i++)
//        {
//            q.add(10+i);
//        }
//        System.out.print(q.poll()+" "+q.size());
    }
}
