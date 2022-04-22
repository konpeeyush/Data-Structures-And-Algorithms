package Arrays;

public class sorted_array {
    public static void main(String[] args) {
        int[] arr={10,20,30} ;
        System.out.println(sort(arr));
    }
    static boolean sort(int[] arr)
    {
        boolean flag=false ;
        for(int i=1;i<arr.length;i++)
        {
            flag=false ;
            if(arr[i]<=arr[i-1])
            {
                flag=true ;
            }
        }
        return flag ;
    }
}
