package Recursion;

import java.util.ArrayList;

public class Reverse_a_string {
    public static void main(String[] args) {
        String str="helloworld" ;
        char ch[]=new char[str.length()] ;
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i) ;
        }
        ArrayList<Character> obj=new ArrayList<>() ;
        for(char c:ch)
        {
            obj.add(c) ;
        }
        System.out.println("Before Reversal:");
        System.out.println(obj);
        reverse(ch,0,ch.length-1) ;
        System.out.println("After Reversal:");
        ArrayList<Character> obj1=new ArrayList<>() ;
        for(char c:ch)
            obj1.add(c) ;
        System.out.println(obj1);
    }
    static void reverse(char[]ch,int low,int high)
    {
        if(low>=high)
            return ;
        char temp =ch[low] ;
        ch[low]=ch[high] ;
        ch[high]=temp ;
        reverse(ch,low=low+1,high=high-1) ;
    }
}
