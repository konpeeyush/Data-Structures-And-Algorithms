package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={20,10} ;
        Selection_Sort f=new Selection_Sort() ;
        f.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j ;
                }
                if(min!=i)
                {
                    int temp=arr[min] ;
                    arr[min]=arr[i] ;
                    arr[i]=temp ;
                }
            }
        }
    }
}
