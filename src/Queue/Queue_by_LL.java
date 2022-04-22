package Queue;

class Node{
    int data ;
    Node next ;
    Node(int data)
    {
        this.data=data ;
    }
}

class Queue2{
    Node front=null ;
    Node rear=null ;

    public void enqueue(int val){
        Node newNode=new Node(val) ;
        newNode.next=null ;

        if(front==null && rear==null){
            front=rear=newNode ;
        }
        else{
            rear.next=newNode ;
            rear=newNode ;
        }
    }

    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Dequeued element is "+front.data);
            front=front.next ;

            if(front==null)
                rear=null ;
        }
    }

}
public class Queue_by_LL {
    public static void main(String[] args) {
        Queue2 list = new Queue2();
        System.out.println("Enqueuing element: "+10);
        list.enqueue(10);
        System.out.println("Enqueuing element: "+20);
        list.enqueue(20);
        System.out.println("Enqueuing element: "+30);
        list.enqueue(30);

        list.dequeue();
        list.dequeue();
        list.dequeue() ;
    }
}
