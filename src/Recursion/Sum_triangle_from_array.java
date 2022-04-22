package Recursion;

import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5} ;
        printTriangle2(arr) ;
    }
    static void printTriangle(int[] arr)
    {
        if(arr.length<1)
            return;
        int[] temp=new int[arr.length-1] ;
        for(int i=0;i<arr.length-1;i++)
        {
            temp[i]=arr[i]+arr[i+1] ;
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

    //iterative approach
    static void printTriangle2(int[] arr)
    {
        int n=arr.length-1 ;
        while(n!=0)
        {
            if(n<1)
                return;
            int[] temp=new int[n] ;
            for(int i=0;i<n;i++)
            {
                temp[i]=arr[i]+arr[i+1] ;
            }
            n-- ;
            System.out.println(Arrays.toString(arr));

        }


    }
}
