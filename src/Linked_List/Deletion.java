package Linked_List;
class LinkedList2{
    Node head ;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
        //Insertion
        public void push(int new_data){
            Node new_Node=new Node(new_data) ;
            new_Node.next=head ;
            head=new_Node ;
        }

        //Deletion
        public void delete(int key){
            Node temp =head;

            if (temp != null && temp.data == key) {
                head = temp.next; // Changed head
                return;
            }

            while(temp.next!=null){
                if(temp.next.data==key){
                    temp.next=temp.next.next ;
                    break ;
                }
                else {
                    temp=temp.next ;
                }
            }

        }

        //Printing
    public void print(){
        Node temp =head ;
        while(temp!=null){
            System.out.print("->"+temp.data);
            temp=temp.next ;
        }
    }

}
public class Deletion {
    public static void main(String[] args) {
        LinkedList2 list=new LinkedList2() ;
        list.push(2) ;
        list.push(3) ;
        list.push(4) ;
        list.push(5) ;
        System.out.print("Before Deletion: ");
        list.print();
        System.out.println();
        System.out.print("After Deletion: ");
        list.delete(5);
        list.print();

    }
}
