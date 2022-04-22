package Queue;

public class DEqueue {
    int[] arr ;
    int rear ;
    int front ;

    DEqueue(int size){
        rear=-1 ;
        front=-1 ;
        arr=new int[size] ;
    }

    //To check whether a queue is empty
    public boolean isEmpty(){
        return (rear==-1 && front==-1) ;
    }

    //To check whether full from front

    public boolean isFullFront(){
        if(front==0)
            return true ;
        return false ;
    }

    public boolean isFullRear(){
        if(rear== arr.length-1)
            return true ;
        return false ;
    }

    public void insertRear(int data){
        if(isFullRear()){
            System.out.println("Overflow");
        }
        else{
            if(front==-1 && rear==-1){
                front=rear=0 ;
                arr[rear]=data ;
            }
            else{
                rear++ ;
                arr[rear]=data ;
            }
        }
    }

    public void insertFront(int data){
        if(isFullFront()){
            System.out.println("Overflow");
        }
        else{
            if(front == -1 && rear ==-1)
            {
                rear= front =0;
                arr[front] = data;
            }
            else{
                front-- ;
                arr[front]=data ;
            }
        }
    }

    public void removeFront(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            if(front==rear){
                System.out.println(arr[front]);
                front=rear=-1 ;
            }
            else{
                System.out.println(arr[front]);
                front++ ;
            }
        }
    }

    public void removeRear(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            if(front==rear){
                System.out.println(arr[rear]);
            }
            else{
                System.out.println(arr[rear]);
                rear-- ;
            }
        }
    }

    public void display(){
        for(int i=front;i<=rear;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        DEqueue obj = new DEqueue(5);
        obj.insertFront(10);
//        obj.insertFront(14);
        obj.insertRear(20);
        obj.insertRear(30);
        obj.insertRear(40);
        obj.insertRear(50);
//        obj.insertRear(60);
//        obj.insertFront(15);
        System.out.println("print all the data ");
        obj.display();
        System.out.println("delete from front");
        obj.removeFront();
        obj.removeFront();
        System.out.println("delete from rear");
        obj.removeRear();
        System.out.println("insert new value at rear ");
        obj.insertRear(90);
        System.out.println("print the data");
        obj.display();
    }
}
