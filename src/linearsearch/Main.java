package linearsearch;

public class Main {
    public static void main(String[] args) {
        int nums[]={23,45,12,78,90} ;
        int target=12 ;
        int ans=linear(nums,target) ;
        System.out.println(ans);
    }
    static int linear(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1 ;
        }
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index] ;
            if(element==target)
            return index ;
        }
        return -1 ;
    }
}
