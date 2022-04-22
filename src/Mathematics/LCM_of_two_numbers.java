package Mathematics;

import java.util.Scanner;

public class LCM_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter two Numbers:");
        int a=sc.nextInt() ;
        int b=sc.nextInt() ;
        System.out.println("LCM of the two numbers is:"+LCM(a,b));
    }

    //Naive Solution
//    static int LCM(int a,int b)
//    {
//        int res=Math.max(a,b) ;
//        while(true)
//        {
//            if(res%a==0&&res%b==0)
//            {
//                return res ;
//            }
//            res++ ;
//        }
//    }

    //Optimized Solution
    static int GCD(int a,int b)
    {
        if(b==0)
        {
            return a ;
        }
        return GCD(b,a%b) ;
    }

    static int LCM(int a,int b)
    {
        return (a*b)/GCD(b,a%b) ;
    }
}
