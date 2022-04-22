package Recursion;
//Didn't Under-stood
public class Max_Min {
    public static void main(String[] args) {
        int[] arr={-40,1,2,-30} ;
        int n=arr.length ;
        System.out.println(minimum(arr,n));
    }
    static int minimum(int[] arr,int length)
    {
        if(length==1)
            return arr[0] ;
        int b=minimum(arr,length-1) ;
        return Math.min(arr[length-1],b) ;
    }
}
