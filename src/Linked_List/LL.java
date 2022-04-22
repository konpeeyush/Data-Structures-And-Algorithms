package Linked_List;

public class LL {

    private Node head ;
    private Node tail ;
    private int size ;

    public LL() {
        this.size = 0;
    }


    public void insertFirst(int val)
    {
        Node node=new Node(val) ;
        node.next=head ;
        head=node ;
        if(tail==null)
        {
            tail=head ;
        }
//        size++ ;
    }

    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val) ;
        tail.next=node ;
        tail=node ;
//        size++ ;
    }

    public void display()
    {
        Node temp=head ;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next ;
        }
        System.out.println("END");
    }

    public Node reverse(Node head){
        Node current = head ;
        Node prev = null ;
        while(current!=null){
            Node temp=current.next ;
            current.next=temp ;
            prev=current ;
            current=temp ;
        }
        return prev ;
    }

    private class Node{
    private int value ;
    private Node next ;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}