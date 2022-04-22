package Mathematics;

import java.util.Scanner;

public class GCD_or_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter two numbers:");
        int a=sc.nextInt() ;
        int b=sc.nextInt() ;
        System.out.println("GCD of both the numbers are:"+GCD(a,b));
    }

        //Naive Solution
//        static int GCD ( int a, int b)
//        {
//            int res = Math.min(a, b);
//            while (res > 0) {
//                if (a % res == 0 && b % res == 0) {
//                    break;
//                }
//                res--;
//            }
//            return res;
//        }

    //Euclidean Algorithm
//    static int GCD(int a,int b)
//    {
//        while(a!=b)
//        {
//            if(a>b)
//            {
//                a=a-b ;
//            }
//            else
//            {
//                b=b-a ;
//            }
//        }
//        return a ;
//    }

    //Optimized Euclidean Algorithm
    static int GCD(int a,int b)
    {
        if(b==0)
            return a ;
        else
        {
            return GCD(b,a%b) ;
        }
    }
}

