package Recursion;
//Reverse a number
public class P7 {
    public static void main(String[] args) {
        rev(1234) ;
        System.out.println(sum);
    }
    //Method 1
    static int sum=0 ;
    static void rev(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem=n%10 ;
        sum=rem+sum*10 ;
        rev(n/10) ;

    }

}