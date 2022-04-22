package binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,0,10,20,30,44,56,89,90,98} ;
        int target=44 ;
        int ans=binary_search(arr,target) ;
        System.out.println(ans);
    }
    static int binary_search(int[] arr, int target)
    {
        int start=0 ;
        int end=arr.length-1 ;
        while(start<=end)
        {
            int mid=start+(end-start)/2 ;
            if(target<arr[mid])
            {
                end=mid-1 ;
            }
            else if(target>arr[mid])
            {
                start=mid+1 ;
            }
            else
                return mid ;
        }
        return Integer.MAX_VALUE ;
    }
}
