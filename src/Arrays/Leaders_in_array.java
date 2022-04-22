package Arrays;

public class Leaders_in_array {
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2} ;
        //leader(arr) ;
        leader1(arr) ;
    }
    static void leader(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=false ;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag=true ;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println(arr[i]);
            }
        }
    }

    static void leader1(int[] arr)
    {
        int current_leader=arr[arr.length-1] ;
        System.out.println(current_leader);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(current_leader<arr[i])
            {
                current_leader=arr[i] ;
                System.out.println(current_leader);
            }

        }
    }
}
