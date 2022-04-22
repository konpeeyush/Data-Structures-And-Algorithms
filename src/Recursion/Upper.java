package Recursion;
public class Upper {
    public static void main(String[] args) {
        String str="mynameisPeemyush" ;
        char res=upper(str,0) ;
        if(res==0)
        {
            System.out.println("No Upper case letter found");
        }
        else
        {
            System.out.println(res) ;
        }
    }
    static char upper(String str,int i)
    {
        if(str.charAt(i)=='\0')
            return 0 ;
        if(Character.isUpperCase(str.charAt(i)))
            return str.charAt(i) ;
        return upper(str,i+1) ;
    }
}
