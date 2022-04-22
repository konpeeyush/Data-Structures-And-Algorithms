package Recursion;

import java.io.*;
import java.util.*;

public class RemoveX {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in) ;
        String s=sc.nextLine() ;
        System.out.println(modify(s)) ;
    }
    static String modify(String s){
        if(s.length()<=1){
            return s ;
        }

        String smallAns=modify(s.substring(1)) ;
        if(s.charAt(0)==smallAns.charAt(0)){
            return s.charAt(0)+"-1"+s.charAt(2) ;
        }
        else {
            return s.charAt(0) + ""+s.charAt(0) ;
        }

    }

}
