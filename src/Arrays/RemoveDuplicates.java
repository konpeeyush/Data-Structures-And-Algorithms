package Arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>() ;
        ArrayList<Integer> obj1=new ArrayList<>() ;
        int[] arr={10,20,30,30} ;
        System.out.println("Before Removal:");

        for(int i=0;i<arr.length;i++)
        {
            obj1.add(arr[i]) ;
        }
        System.out.println(obj1);
        int res=remove(arr) ;

        System.out.println("After Removal:");
        for(int i=0;i<res;i++)
        {
            obj.add(arr[i]) ;
        }
        System.out.println(obj);

    }
    static int remove(int[] arr)
    {
        int[] temp=new int[arr.length] ;
        temp[0]=arr[0] ;
        int res=1 ;
        for(int i=1;i< arr.length;i++)
        {
            if(temp[res-1]!=arr[i])
            {
                temp[res]=arr[i] ;
                res++ ;
            }
        }
        for(int i=0;i<res;i++)
        {
            arr[i]=temp[i] ;
        }
        return res ;
    }

    //efficient method
    static int remove2(int[] arr)
    {
        int res=1 ;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i] ;
                res++ ;
            }
        }
        return res ;
    }
}
