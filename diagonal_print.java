import java.util.*;
class diagonal_print
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,t,sum=0,n,k;
        System.out.println("INPUT A SIZE OF MATRIX:");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("INPUT NUMBER:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("DISPLAY OF ORIGINAL MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("DISPLAY OF FORWARD DIGONAL OF MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("DISPLAY OF BACKWARD DIGONAL OF MATRIX");
        k=n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==k)
                {
                    System.out.print(a[i][j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
            k--;
        }
    }
}