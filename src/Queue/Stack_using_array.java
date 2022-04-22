package Queue;

public class Stack_using_array {
    static int[] data ;
    static int top ;

    public Stack_using_array(int size) {
        data=new int[size] ;
        top=-1 ;
    }
    public static void push(int val){
        if(size()==data.length){
            doubleCapacity();
        }
        top++ ;
        data[top]=val ;

    }

    private static int size(){
        return top+1 ;
    }

    private static void doubleCapacity(){
        int temp[]=data ;
        data=new int[data.length*2] ;
        for (int i = 0; i < top; i++) {
            data[i]=temp[i] ;
        }

    }

    public static void pop(){
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return ;
        }

        System.out.println(data[top]);
        top-- ;
    }

    public static void main(String[] args) {
        Stack_using_array stack=new Stack_using_array(1) ;
        stack.push(10) ;
        stack.pop();
    }
}
