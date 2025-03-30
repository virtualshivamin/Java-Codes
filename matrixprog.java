import java.util.*;
class matrixprog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        String a,b,c;
        System.out.println("INPUT SIZE OF ARRAY 'size must be greater than 3 and smaller than 10' :");
        n=sc.nextInt();
        System.out.println("INPUT FIRST CHARACTOR:");
        a=sc.next();
        System.out.println("INPUT SECOND CHARACTOR:");
        b=sc.next();
        System.out.println("INPUT THIRD CHARACTOR:");
        c=sc.next();
        if(n>3&&n<10)
        {
            String arr[][]=new String[n][n];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==0||i==(n-1)||j==0||j==(n-1))
                    {
                        if(i==0 && j==0)
                        {
                            arr[i][j]=a;
                        }
                        else if(i==(n-1) && j==(n-1))
                        {
                            arr[i][j]=a;
                        }
                        else if(i==0 && j==(n-1))
                        {
                            arr[i][j]=a;
                        }
                        else if(i==n-1 && j==0)
                        {
                            arr[i][j]=a;
                        }
                        else
                        {
                            arr[i][j]=b;
                        }
                    }
                    else
                    {
                        arr[i][j]=c;
                    }
                }
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}