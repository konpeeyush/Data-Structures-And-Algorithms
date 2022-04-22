package Recursion;

import java.util.Scanner;

//Print 1 to n without loop

public class P1 {
    public static void main(String[] args) {
        System.out.println("Enter some value");
        Scanner sc=new Scanner(System.in) ;
        int num=sc.nextInt() ;
        print(5) ;

    }
    //Method 1
    static void print(int initial,int last)
    {
        if(initial<=last)
        {

            System.out.println(initial+" ");
            print(initial+1,last) ;
        }

    }

    //Method 2
    static void print(int n)
    {
        if(n>0)
        {
            print(n-1) ;
            System.out.println(n+" ");
        }
        return;
    }
}
