public class Main {
    public static void main(String[] args) {
        pattern13(5);
    }

    //Pattern 1
    static void pattern1(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Pattern 2
    static void pattern2(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 3
    static void pattern3(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 4
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    //Pattern 5
    static void pattern5(int n)
    {
        for(int row=0;row<2*n;row++)
        {

            int TotalColumn_in_row=row>n?2*n-row:row ;

            for(int col=0;col<TotalColumn_in_row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 6
    static void pattern6(int n)
    {
        for(int row=0;row<n;row++)
        {
            int total_spaces=n-row ;
            for(int s=0;s<total_spaces-n;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 7
    static void pattern7(int n)
    {
        for(int row=0;row<n;row++)
        {
            int total_spaces=row ;
            for(int s=0;s<total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 8
    static void pattern8(int n)
    {

        for(int row=1;row<=n;row++)
        {
            int total_spaces=n-row ;
            for(int s=0;s<total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<2*row-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 9 Not solved
    static void pattern9(int n)
    {
        for(int row=n;row>=1;row--)
        {
            int total_spaces=row ;
            for(int s=0;s<total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<2*row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 10
    static void pattern10(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int total_spaces=n-row ;
            for(int s=0;s<total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 11
    static void pattern11(int n)
    {
        for(int row=0;row<n;row++)
        {
            int total_spaces=row ;
            for(int s=0;s<=total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 12
    static void pattern12(int n)
    {
        for(int row=1;row<n;row++)
        {
            int total_spaces=row ;
            for(int s=1;s<total_spaces;s++)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=n-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row=0;row<n;row++)
        {
            int total_spaces=n-row ;
            for(int s=1;s<total_spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 13 Not User Input
    static void pattern13(int n)
    {

        for(int row=1;row<=4;row++)
        {

            for(int col=1;col<=7;col++)
            {
                if((row==4)||(row+col==5)||(col-row==3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }


}
