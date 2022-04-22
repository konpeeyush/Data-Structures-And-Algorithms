package Recursion;

public class length_of_string {
    public static void main(String[] args) {
        String str="Piyush" ;
        System.out.println(len(str));
    }
    static int len(String str)
    {
        if(str.equals(""))
            return 0 ;
        else
            return len(str.substring(1))+1 ;
    }
}
