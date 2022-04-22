package Linked_List;

 class LinkedList<T>{
    Node head ;
    class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
            next=null ;
        }
    }

    //Insert first
    public void push(int new_data){
        Node new_node=new Node(new_data) ;
        new_node.next=head ;
        head=new_node ;
    }

    //Insert at the end
    public void append(int new_data){
        Node new_node=new Node(new_data) ;
        if(head==null){
            head = new Node(new_data) ;
            return;
        }
        new_node.next=null ;
        Node last = head ;
        while(last.next != null){
            last=last.next ;
        }
        last.next=new_node ;
    }

    public void print(){
        Node tNode=head ;
        while(tNode!=null){
            System.out.print("->"+tNode.data);
            tNode=tNode.next ;
        }
    }
}
 class Insertion {
    public static void main(String[] args) {
        LinkedList list=new LinkedList() ;
        list.append(6);
        list.append(7);
        list.append(8);
        list.push(2) ;
        list.push(3) ;
        list.push(4) ;
        list.push(5) ;
        list.print();
    }
}
