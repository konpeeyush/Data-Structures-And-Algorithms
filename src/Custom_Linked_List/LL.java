package Custom_Linked_List;

import java.util.ArrayList;

class Node<T>{
    Node<T> next ;
    T data ;

    public Node(T data) {
        this.data=data ;
    }
}
public class LL<T> {
    Node<T> head ;

    public void insertFirst(T val){
        Node<T> newNode=new Node<>(val) ;
        if(head==null){
            head=newNode ;
            return;
        }
        newNode.next=head ;
        head=newNode ;
        return;
    }

    public ArrayList<T> neighboursList(){
        ArrayList<T> list=new ArrayList<>() ;
        Node<T> temp=head ;
        while(temp!=null){
            list.add(temp.data) ;
            temp=temp.next;
        }
        return list ;
    }
}
