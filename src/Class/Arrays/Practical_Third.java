package Class.Arrays;

public class Practical_Third {
    Practical_Third()
    {
        int[] arr={10,12,14,16,18,20} ;
        int i=0 ;
        int sum=0 ;
        System.out.println("Array Elements");
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            sum+=arr[i] ;
            i++ ;

        }
        System.out.println("Number of Elements:"+i);
        System.out.println("Sum is:"+sum);
    }
    public static void main(String[] args) {
        Practical_Third obj=new Practical_Third() ;
    }
}
