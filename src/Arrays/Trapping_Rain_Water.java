package Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr={3,0,1,2,5} ;
        System.out.println("Units of water trapped: "+getWater(arr, arr.length));
        System.out.println("Units of water trapped: "+getWater2(arr, arr.length));
    }
    //Naive approach
    static int getWater(int[] arr,int n)
    {
        int res = 0 ;
        for(int i=1;i<n;i++)
        {
            int l_max=arr[i] ;
            for(int j=0;j<i;j++)
            {
                l_max=Math.max(l_max,arr[j]) ;
            }

            int r_max=arr[i] ;
            for(int j=i+1;j<n;j++)
            {
                r_max=Math.max(r_max,arr[j]) ;
            }
            res=res+(Math.min(l_max,r_max))-arr[i] ;
        }
        return res ;
    }
    //Efficient Approach
    static int getWater2(int[]arr,int n)
    {
        int res= 0 ;
        int[] lmax=new int[n] ;
        int[] rmax=new int[n] ;
        lmax[0]=arr[0] ;
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(arr[i],lmax[i-1]) ;
        }
        rmax[n-1]=arr[n-1] ;
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(arr[i],rmax[i+1]) ;
        }
        for(int i=1;i<n-1;i++)
        {
            res=res+Math.min(lmax[i],rmax[i])-arr[i] ;
        }
        return res ;
    }



}
