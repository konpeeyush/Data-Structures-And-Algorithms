package Queue;

import java.util.Stack;

public class Stack_using_Linked_Lists {
    class Node{
        Node next ;
        int data ;

        public Node(int data) {
            this.data = data;
        }
    }
     Node head=null ;
    public void push(int val){
        Node newNode=new Node(val) ;
        if(head==null){
            head=newNode ;
        }
        newNode.next=head ;
        head=newNode ;

    }

    public void pop(){
        if(head==null){
            return;
        }
        else {
            System.out.println("Popped Element: "+head.data);
            head=head.next ;
        }
    }

    public static void main(String[] args) {
        Stack_using_Linked_Lists stack=new Stack_using_Linked_Lists() ;
        stack.push(10) ;
        stack.push(20) ;
        stack.push(30) ;
        stack.pop() ;
        stack.pop() ;
        stack.pop() ;
    }
}
