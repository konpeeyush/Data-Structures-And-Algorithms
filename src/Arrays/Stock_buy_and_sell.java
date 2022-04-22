package Arrays;

public class Stock_buy_and_sell {
    public static void main(String[] args) {
        int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
        int n=arr.length ;
        System.out.println("MAX Profit would be: "+maxProfit(arr,0,n-1));
        System.out.println("MAX Profit: "+profit(arr));
    }
    //Naive Approach
    static int maxProfit(int arr[],int start, int end)
    {
        int profit= 0 ;

            if(end<=start)
                return 0 ;
            for(int i=start;i<end;i++)
            {
                for(int j=i+1;j<=end;j++)
                {
                    int current_profit = arr[j]-arr[i]+maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end) ;
                    profit = Math.max(profit,current_profit) ;
                }
            }
            return profit ;
    }

    //Efficient Approach
    static int profit(int[] arr)
    {
        int profit=0 ;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
                profit+=arr[i]-arr[i-1] ;
        }
        return profit ;
    }
}
