package Class.Arrays;

import java.util.Scanner;

public class Number_of_positive_and_negatives {
    Number_of_positive_and_negatives() {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5] ;
        int i=0 ;
        int pos=0 ;
        int neg=0 ;
        System.out.println("Enter elements in an array:");
        while(i<arr.length) {
            arr[i] = sc.nextInt();
            if(arr[i]>0)
            {
                pos++ ;
            }
            else
            {
                neg++ ;
            }
            i++;
        }
        System.out.println("Total Elements: "+arr.length);
        System.out.println("Positive: "+pos
        +"\n"+ "Negatives: "+neg);

    }

    public static void main(String[] args) {
        Number_of_positive_and_negatives obj=new Number_of_positive_and_negatives() ;

    }
}
