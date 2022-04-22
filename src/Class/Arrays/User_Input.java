package Class.Arrays;
import java.util.Scanner ;
public class User_Input {

    User_Input()
    {
        Scanner sc = new Scanner(System.in) ;
        int arr[] = new int[5] ;
        System.out.println("Enter elements in an array:");
        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt() ;
        System.out.println("Entered Elements:");
        for(int i = 0; i<arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        User_Input obj=new User_Input() ;
    }
}
