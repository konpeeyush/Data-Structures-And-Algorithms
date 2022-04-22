package Mathematics;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in) ;
        int x=sc.nextInt() ;

        System.out.println("Number of digits in the number are: "+Count(x));
    }

    static int Count(int x)
    {
        int res=0 ;
        while(x>0)
        {
            x=x/10 ;
            res++ ;
        }
        return res ;
    }
}
