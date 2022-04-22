package Arrays;

public class Searching2D
{
    public static void main(String[] args)
    {
        int[][] arr={
                {12,13,14,15},
                {1,2,3,4,5}
        } ;
        int target=5 ;
        System.out.println(search(arr,target));
    }
    static boolean search(int[][] arr,int target)
    {
        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] == target) {
                    return true;
                }
            }
        }
        return false ;
    }
}
