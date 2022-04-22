package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int arr[]={-1,-2,-3,0,10,20,30,44,56,89,90,98} ;
        int arr[]={98,78,44,43,42,12,9,7} ;
        int target=44 ;
        System.out.println(order(arr,target));

    }
    static int order(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1 ;
        //Returns true if in ascending order
        boolean isAsc=arr[start]<arr[end] ;
        while(start<=end)
        {
            int mid=start+(end-start)/2 ;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target<arr[mid])
                {
                    end=mid-1 ;
                }
                else
                    start=mid+1 ;
            }
            else                //For Descending order
            {
                if(target>arr[mid])
                {
                    end=mid-1 ;
                }
                else
                {
                    start=mid+1 ;
                }
            }
        }
        return Integer.MAX_VALUE ;
    }
}
