package Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30};
        int n = arr.length;
        freq(arr, n);
    }

    static void freq(int[] arr, int n) {
        int i = 1;
        int count = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                count++;
                i++;
                System.out.println("Frequency of " + arr[i - 1] + " " + count);
                i++;
                count = 1;
            }
        }
    }
}
