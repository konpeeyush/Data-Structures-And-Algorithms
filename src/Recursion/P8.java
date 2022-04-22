package Recursion;
//Palindrome
public class P8 {
    public static void main(String[] args) {
        int n=121 ;
        fun(n) ;
        System.out.println(isPal(n)); ;
    }
    static int sum=0 ;
    static void fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        int rem=n%10 ;
        sum=sum*10+rem ;
        fun(n/10) ;
    }
    static boolean isPal(int n)
    {
        return sum==n ;
    }
}
