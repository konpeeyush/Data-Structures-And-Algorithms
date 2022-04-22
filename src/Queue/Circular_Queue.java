package Queue;

public class Circular_Queue {
    int[] arr ;
    int size ;
    int front=-1, rear=-1 ;

    Circular_Queue(int size){
        this.size=size ;
        arr=new int[size];
    }

    public void enqueue(int val){
        if((rear+1)%size==front){
            System.out.println("Overflow");
            return;
        }
        if(front==-1)
            front=0 ;
        rear=(rear+1)%size ;
        arr[rear]=val ;
    }

    public int dequeue() throws Exception{
        if(front==-1)
        {
            throw new Exception("Underflow") ;
        }

        int result=arr[front] ;
        if(front==rear)
            front=rear=-1 ;
        else{
            front=(front+1)%size ;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Circular_Queue queue=new Circular_Queue(5) ;
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
    }
}
