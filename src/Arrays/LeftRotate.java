package Arrays;

import java.util.ArrayList;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={1,2} ;
       // left(arr);
        right(arr,3) ;
        ArrayList<Integer> obj=new ArrayList<>() ;
        for(int i=0;i<arr.length;i++)
        {
            obj.add(arr[i]) ;
        }
        System.out.println("After Rotation:");
        System.out.println(obj);
    }
    //Left Rotate by one
    static void left(int[] arr)
    {
        int temp=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i] ;
        }
        arr[arr.length-1]=temp ;
    }

    //Right Rotate by one
    static void right(int[] arr)
    {
        if(arr.length<=2)
        {
            int temp=arr[arr.length-1] ;
            for(int i=arr.length-1;i>0;i--)
            {
                arr[i]=arr[i-1] ;
            }
            arr[0]=temp ;
        }
        else{
            int temp=arr[arr.length-1] ;
            arr[arr.length-1]=arr[0] ;
            arr[0]=temp ;

        }
    }
    //Left rotate by d
    static void right(int[] arr,int d)
    {
        if(d<=arr.length)
        {
            for(int i=0;i<d;i++)
            {
                left(arr) ;
                right(arr) ;
            }
        }
        else
            return;
    }
}
