import java.util.*;
class Matrix_Digonal_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("INPUT SIZE OF MATRIX :");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,t,sum=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("INPUT NUMBER:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("DISPLAY OF MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();                                                                                                
        }
        t=4;
        System.out.println("PRINCIPAL DIGONAL : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum=sum+a[i][j];
                    System.out.print(a[i][j]+"\t");
                }
                if(i!=2&&j!=2)
                {
                    if(t==j)
                    {
                        sum=sum+a[i][j];
                        System.out.print(a[i][j]+"\t");
                    }
                }
            }
            t--;
        }
        System.out.println();
        System.out.println("SUM OF DIAGONAL: "+sum);
    }
}