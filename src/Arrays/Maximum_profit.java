//package Arrays;
//
//public class Maximum_profit {
//    public static void main(String[] args) {
//        int[] arr={ 2, 30, 15, 10, 8, 25, 80 };
//        int n=arr.length ;
//        System.out.println("Maximum Profit:"+maxProfit(arr,n));
//    }
//    static int maxProfit(int[] arr,int n)
//    {
//        int[] profit=new int[n] ;
//        for(int i=0;i<n;i++)
//        {
//            profit[i]=0 ;
//        }
//        int maxPrice=arr[n-1] ;
//        for(int i=n-2;i>=0;i--)
//        {
//            if(arr[i]>maxPrice)
//            {
//                maxPrice=arr[i] ;
//            }
//            profit[i]=Math.max(profit[i+1],maxPrice-arr[i]) ;
//        }
//
//        int minPrice=arr[0] ;
//        for(int i=1;i<n;i++)
//        {
//            if(arr[i]<minPrice)
//            {
//                minPrice=arr[i] ;
//            }
//            profit[i]=Math.max(profit[i-1],)
//        }
//    }
//}
