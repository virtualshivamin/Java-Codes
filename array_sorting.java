import java.util.*;
class array_sorting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("INPUT ROW No:");
        m=sc.nextInt();
        System.out.println("INPUT COLUMN No:");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int i,j,k,l,t;
        for(i=0;i<m;i++)
        {
            System.out.println("INPUT ROW VALUE "+(i+1));
            for(j=0;j<n;j++)
            {
                System.out.println("INPUT VALUE:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("DISPLAY OF ARRAY:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=i;k<m;k++)
                {
                    for(l=0;l<n;l++)
                    {
                        if(a[i][j]<a[k][l])
                        {
                            t=a[i][j];
                            a[i][j]=a[k][l];
                            a[k][l]=t;
                        }
                    }
                }
            }
        }
        System.out.println("DISPLAY OF SORTED ARRAY:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}