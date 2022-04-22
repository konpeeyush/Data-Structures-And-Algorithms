package Recursion;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,3,5,10} ;
        int target=10 ;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end)
    {
        if(end<start)
            return Integer.MAX_VALUE;
        int mid=start+(end-start)/2 ;
        if(target<arr[mid])
        {
            return search(arr,target,start,end=mid-1) ;
        }
        else if(target>arr[mid])
        {
            return search(arr,target,start=mid+1,end) ;
        }
         else
             return mid ;
    }
}
