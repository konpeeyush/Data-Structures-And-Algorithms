package Recursion;
//Product of numbers of a digit.
public class P6 {
    public static void main(String[] args) {
        System.out.println(prod(122));
    }
    static int prod(int n)
    {
        if(n%10==n)
        {
            return n ;
        }
        return (n%10)*prod(n/10) ;
    }
}
