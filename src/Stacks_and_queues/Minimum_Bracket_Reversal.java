package Stacks_and_queues;

import java.util.Stack;

public class Minimum_Bracket_Reversal {
    public static void main(String[] args) {
       String s="}{}{" ;
        Stack<Character> stack=new Stack<>() ;
       int n=s.length() ;
       if(n%2==0){
           for (int i = 0; i < n; i++) {
               if(stack.empty() && s.charAt(i)=='}'){
                   stack.push(s.charAt(i)) ;
               }
               else if(!stack.empty() && s.charAt(i)=='{' || s.charAt(i)=='}'){
                   stack.push(s.charAt(i)) ;
               }
               else
               {
                   if(!stack.empty() && s.charAt(i)=='}'){
                       if(stack.peek()=='{')
                           stack.pop() ;
                   }
               }
           }
       }
       else
           System.out.println("-1");
    }
}
