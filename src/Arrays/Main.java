package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,20,30} ;
        fun(arr) ;

    }
    static void fun(int[] arr)
    {
        int temp=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i] ;
        }
        arr[arr.length-1]=temp ;
        for(int i=0;i<arr.length-1;i++)
            System.out.println(arr[i]);
    }

}