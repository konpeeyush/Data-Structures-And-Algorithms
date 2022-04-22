package Stacks_and_queues;

import java.util.Stack;

public class Redundant_Parantheses {
    public static void main(String[] args) {
        String s="(a+b)" ;
        Stack<Character> stack=new Stack<>() ;
        boolean ans=false ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                stack.push(s.charAt(i)) ;
            }
            else if(s.charAt(i)=='('){
                stack.push(s.charAt(i)) ;
            }
            else if(s.charAt(i)==')'){
                if(stack.peek()=='(')
                    ans=true ;
                while(stack.peek()=='+' || stack.peek()=='-' || stack.peek()=='/' || stack.peek()=='*'){
                    stack.pop() ;
                }
                stack.pop() ;
            }
        }
        System.out.println(ans);
    }
}
