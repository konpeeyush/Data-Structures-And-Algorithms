package Stacks_and_queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt_Examples {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>() ;
//        stack.push(21) ;
//        stack.push(22) ;
//        stack.push(23) ;
//        stack.push(24) ;
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>() ;
        queue.add(1) ;
        queue.add(2) ;
        queue.add(10) ;
        queue.add(20) ;
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
