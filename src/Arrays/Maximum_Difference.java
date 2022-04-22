package Arrays;

public class Maximum_Difference {
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1} ;
        //maximum_difference(arr) ;
        max(arr) ;
    }
    static void maximum_difference(int[] arr)
    {
        int maximum_difference=arr[1]-arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                maximum_difference=Math.max(maximum_difference,arr[j]-arr[i]) ;
            }
        }
        System.out.println(maximum_difference);
    }

    //Efficient Solution
    static void max(int[] arr)
    {
        int res=arr[1]-arr[0] ;
        int minval=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
            res=Math.max(res,arr[i]-minval) ;
            minval=Math.min(minval,arr[i]) ;
        }
        System.out.println(res);
    }
}
