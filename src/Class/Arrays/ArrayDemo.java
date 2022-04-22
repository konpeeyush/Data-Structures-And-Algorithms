package Class.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo obj =new ArrayDemo() ;

    }
    void func()
    {
        int[] arr={10,20,30,40} ;
        System.out.println("Array Elements");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    ArrayDemo()
    {
        int[] arr=new int[5] ;
        arr[0]=100 ;
        arr[1]=200 ;
        arr[2]=300 ;
        arr[3]=400 ;
        arr[4]=500 ;
        System.out.println("Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
