package Mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter a number: ");
        int x=sc.nextInt() ;
        System.out.println("Factorial of the given number is: "+fact(x));
    }
    //Iterative solution
//    static int fact(int n)
//    {
//        int res=1 ;
//        for(int i=2;i<=n;i++)
//        {
//            res=res*i ;
//        }
//        return res ;
//    }

    //Recursive Solution
    static int fact(int n)
    {
        if(n==0)
        {
            return 1 ;
        }
        return n*fact(n-1) ;
    }
}
