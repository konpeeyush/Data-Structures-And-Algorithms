package Queue;

class Queue {
    private int[] data ;
    private int front ;
    private int rear ;
    private int size ;

    public Queue() {
        data=new int[10] ;
        front=-1 ;
        rear=-1 ;
        size=0;
    }

    int size(){
        return size ;
    }

    boolean isEmpty(){
        return size==0 ;
    }

    void enqueue(int element) throws Queue_Exception{
        if((rear+1)% data.length==front){
            System.out.println("Overflow");
            throw new Queue_Exception() ;
        }
        if(front==-1)
            front=0 ;
        rear=(rear+1)%data.length ;
        data[rear]=element ;
    }

    int dequeue() throws Exception{
        if(front==-1)
        {
            throw new Queue_Exception() ;
        }

        int result=data[front];
        if(front==rear)
            front=rear=-1 ;
        else{
            front=(front+1)%data.length ;
        }
        return result ;
    }



    public static void main(String[] args) throws Queue_Exception {
        Queue q=new Queue() ;
        for (int i = 0; i < 10; i++) {
            try{
                q.enqueue(i);
            }
            catch (Queue_Exception e){

            }
        }

        while(!q.isEmpty()){
            try{
                System.out.println(q.dequeue());

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
