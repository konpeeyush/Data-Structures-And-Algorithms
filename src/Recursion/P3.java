package Recursion;
//Print n to 1
public class P3 {
    public static void main(String[] args) {
        rec(5) ;
    }
    static void rec(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        rec(n=n-1) ;

    }
}
