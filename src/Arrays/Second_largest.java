package Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int[] arr={10,20,30} ;
        int value=arr[second(arr)] ;
        System.out.println("Index:"+second(arr)+
                " Element:"+value);
    }
    static int second(int[] arr)
    {
        int res=-1 ;
        int largest=0 ;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest ;
                largest=i ;
            }
            else if(arr[i]!=arr[largest])
            {
                if(res==-1||arr[i]>arr[res])
                    res=i ;
            }
        }
        return res ;
    }

}
