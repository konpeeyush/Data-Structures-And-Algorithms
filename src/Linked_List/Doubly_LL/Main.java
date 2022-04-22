package Linked_List.Doubly_LL;

class Node{
    Node next ;
    Node prev ;
    int data ;
}

class Doubly_LL{
    Node head,tail ;

    public void addFirst(int val){
        Node newNode=new Node() ;
        newNode.data=val ;

        if(head==null){
            newNode.next=null ;
            newNode.prev=null ;
            head=newNode ;
        }
        else{
            newNode.prev=null ;
            newNode.next=head ;
            head.prev=newNode ;
            head=newNode ;
        }
    }

    public void addLast(int value){
        Node newNode=new Node() ;
        newNode.data=value ;
        if(head==null){
            newNode.next=null ;
            newNode.prev=null ;
            head=newNode ;
        }
        else{
            Node last=head ;
            while(last.next!=null){
                last=last.next ;
            }
            last.next=newNode ;
            newNode.prev=last ;
            newNode.next=null ;
        }
    }

    public void traverse(){
        Node temp=head ;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next ;
        }
    }

    public void backwardTraverse(){
        Node temp=tail ;
    }
}
public class Main {
    public static void main(String[] args) {
        Doubly_LL list=new Doubly_LL() ;
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.traverse();
    }
}
