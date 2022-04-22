package Recursion;

public class PrintsSubsets {
    public static void main(String[] args) {
        int[] output=new int[0] ;
        int[] input={1,2,3} ;
        printSubsets(input,0,output);

    }
    public static void printSubsets(int[] input,int si,int[] output){
        if(si==input.length){
            for (int i:output
                 ) {
                System.out.print(i+" ");
                System.out.println();
                return ;
            }
        }
        printSubsets(input,si+1,output);
        int newoutput[]=new int[output.length+1];
        int j=0;
        for( ;j<output.length;j++)
        {
            newoutput[j]=output[j];
        }
        newoutput[j]=input[si];
        printSubsets(input,si+1,newoutput);
    }
    }

