package Tree.Generic_Trees;

import java.util.Arrays;

public class Binary_tree_by_array<T> {
    int[] arr ;
    int lastUsedIndex ;

    public Binary_tree_by_array(int size) {
        arr=new int[size+1] ;
        lastUsedIndex=0 ;
    }

    public void insert(int val){
        if(arr.length-1==lastUsedIndex){
            System.out.println("Array is full.");

        }
        else{
            arr[lastUsedIndex+1]=val ;
            lastUsedIndex++ ;
        }
    }

    //pre order traversal
    public long[] traverse(int index){
        if(index>lastUsedIndex){
            return new long[0];
        }
        System.out.print(arr[index]+"->");
        traverse(index*2) ;
        traverse(index*2+1);

        return new long[0];
    }

    public int search(int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value) {
                return i;
            }
        }
        return -1 ;
    }

    public  void delete(int value){
        arr[search(value)]=arr[lastUsedIndex] ;
        lastUsedIndex-- ;
    }
    public static void main(String[] args) {
        Binary_tree_by_array tree=new Binary_tree_by_array(8) ;
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(11);
        System.out.println(Arrays.toString(tree.traverse(1)));

    }
}
