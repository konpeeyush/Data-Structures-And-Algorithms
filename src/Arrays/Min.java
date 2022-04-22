package Arrays;

public class Min {
    public static void main(String[] args) {
        int[] arr={12,13,-7,18,3} ;
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int min=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]<min)
           {
               min=arr[i] ;
           }
        }
        return min ;
    }
}
