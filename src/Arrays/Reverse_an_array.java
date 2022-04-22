package Arrays;

import java.util.* ;

public class Reverse_an_array {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>() ;
        ArrayList<Integer> obj1=new ArrayList<>() ;
        int[] arr={10,20,30} ;
        System.out.println("Before Reversal:");
        for(int i=0;i<arr.length;i++)
        {
            obj1.add(arr[i]) ;
        }
        System.out.println(obj1);
            reverse(arr) ;
        for(int i=0;i<arr.length;i++)
        {
            obj.add(arr[i]) ;
        }
        System.out.println("After Reversal:");
        System.out.println(obj);
    }
    static void reverse(int[] arr)
    {
        int low=0 ;
        int high=arr.length-1 ;
        while(low<high)
        {
            int temp=arr[low] ;
            arr[low]=arr[high] ;
            arr[high]=temp ;
            low++ ;
            high-- ;
        }
    }
}
