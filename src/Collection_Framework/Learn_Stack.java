package Collection_Framework;

import java.util.Stack;

public class Learn_Stack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>() ;
        animals.push("Lion") ;
        animals.push("Dog") ;
        animals.push("Cat") ;
        animals.push("Mouse") ;
        System.out.println("Animals"+animals);
        System.out.println("Top Element"+animals.peek());
    }
}
