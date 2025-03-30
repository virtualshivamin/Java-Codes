import java.util.*;
class matrix_multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,r1,r2,c1,c2,k;
        System.out.println("INPUT ROW 1");
        r1=sc.nextInt();
        System.out.println("INPUT COLUMN 1");
        c1=sc.nextInt();
        System.out.println("INPUT ROW 2");
        r2=sc.nextInt();
        System.out.println("INPUT COLUMN 2");
        c2=sc.nextInt();
        if(c1==r2)
        {
            int mat1[][]=new int[r1][c1];
            int mat2[][]=new int[r2][c2];
            System.out.println("INPUT VALUES FOR MATRIX 1:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.println("INPUT A NO:");
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("INPUT VALUES FOR MATRIX 2:");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.println("INPUT A NO:");
                    mat2[i][j]=sc.nextInt();
                }
            }
            System.out.println("DISPLAY OF FIRST MATRIX:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("DISPLAY OF SECOND MATRIX:");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            
            int mu[][]=new int[r1][c2];
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    mu[i][j]=0;
                    for(k=0;k<c1;k++)
                    {
                        mu[i][j]=mu[i][j]+(mat1[i][k]*mat2[k][j]);
                    }
                }
            }
            System.out.println("MULTIPLICATION OF MATRIX:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(mu[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("MULTIPLICATION NOT POSSIBLE:");
        }
    }
}