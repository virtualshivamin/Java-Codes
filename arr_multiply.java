import java.util.*;
class arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        int c[][]=new int[4][4];
        int i,j,k;
        for(i=0;i<4;i++)
        {
            System.out.println("INPUT ROW"+(i+1)+"VALUE");
            for(j=0;j<4;j++)
            {
                System.out.println("INPUT VALUE");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            System.out.println("INPUT ROW"+(i+1)+"VALUE");
            for(j=0;j<4;j++)
            {
                System.out.println("INPUT VALUE");
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                c[i][j]=0;
                for(k=0;k<4;k++)
                {
                    c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
                }
            }
        }
        System.out.println("DISPLAY OF FIRST MATRIX");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(a[i][j]+"\t");
            }
        }
        System.out.println("DISPLAY OF SECOND MATRIX");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(b[i][j]+"\t");
            }
        }
        System.out.println("MULTIPLICATION OF FIRST AND SECOND MATRIX");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(a[i][j]+"\t");
            }
        }
    }
}