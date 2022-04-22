package Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[]={12,123,18,9898} ;
        System.out.println(find_numbers(arr));
    }
    static int find_numbers(int[] nums)
    {
        int count=0 ;
        for(int n:nums)
        {
            if(even(n))
            {
                count++ ;
            }
        }
        return count;
    }

    static boolean even(int n)
    {
        int number_of_digits=digits(n) ;
        return number_of_digits%2==0 ;
    }

    static int digits(int n)
    {
        int count=0 ;
        while(n>0)
        {
            count++ ;
            n/=10 ;
        }
        return count ;

    }
}
