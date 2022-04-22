package Recursion;
//Count number of zeroes
public class P9 {
    public static void main(String[] args) {
        count(200800) ;
        System.out.println(count);
    }
    static int count=0 ;
    static void count(int n)
    {

        if(n==0)
            return ;
        if(n%10==0){
            count++ ;
        }
        count(n/10) ;
    }

}
