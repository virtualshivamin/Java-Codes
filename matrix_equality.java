import java.util.*;
class matrix_equality
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1,r2,c1,c2,i,j;
        System.out.println("INPUT ORDER OF ROW FOR MATRIX ONE");
        r1=sc.nextInt();
        System.out.println("INPUT ORDER OF COLUMN FOR MATRIX ONE");
        c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("INPUT OF MATRIX");
        for(i=0;i<r1;i++)
        {
            System.out.println("INPUT VALUE FOR ROW"+(i+1));
            for(j=0;j<c1;j++)
            {
                System.out.println("INPUT VALUE");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("INPUT ORDER OF ROW FOR MATRIX TWO");
        r2=sc.nextInt();
        System.out.println("INPUT ORDER OF COLUMN FOR MATRIX TWO");
        c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("INPUT OF MATRIX");
        for(i=0;i<r2;i++)
        {
            System.out.println("INPUT VALUE FOR ROW"+(i+1));
            for(j=0;j<c2;j++)
            {
                System.out.println("INPUT VALUE");
                b[i][j]=sc.nextInt();
            }
        }
        if(r1==r2&&c1==c2)
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        System.out.println("THE TWO MATRIX ARE NOT EQUAL");
                        i=r1;
                        break;
                    }
                }
                System.out.println("THE TWO MATRIX ARE EQUAL");
                break;
            }
        }
        else
        {
            System.out.println("THE TWO MATRIX ARE NOT EQUAL");
        }
    }
}