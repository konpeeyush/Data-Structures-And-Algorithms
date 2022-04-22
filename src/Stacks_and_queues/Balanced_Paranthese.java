package Stacks_and_queues;

import java.util.Stack;

public class Balanced_Paranthese {
    public static void main(String[] args) {
        String s="{[()]}" ;
        if(isValid(s)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean isValid(String s){
        int n=s.length() ;
        Stack<Character> stack=new Stack<Character>() ;
        boolean ans=true ;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='(' || s.charAt(i) =='[' ||s.charAt(i)=='{' ){
                stack.push(s.charAt(i)) ;
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop() ;
                }
                else{
                    ans=false ;
                    break;
                }
            }

            else if(!stack.isEmpty() && s.charAt(i)==']'){
                if(stack.peek()=='['){
                    stack.pop() ;
                }
                else{
                    ans=false ;
                    break;
                }
            }

            else if(!stack.isEmpty() && s.charAt(i)=='}'){
                if(stack.peek()=='{'){
                    stack.pop() ;
                }
                else{
                    ans=false ;
                    break;
                }
            }
        }
        if(!stack.isEmpty())
            return false ;
        return ans ;
    }
}
