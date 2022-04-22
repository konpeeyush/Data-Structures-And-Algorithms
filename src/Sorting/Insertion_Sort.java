package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,7,9,2,11,45,1} ;
        insertion(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i] ;
            int j=i-1 ;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j] ; //Right Shift
                j-- ;
            }
            arr[j+1]=temp ;
        }
    }
}
