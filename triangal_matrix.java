import java.util.*;
class triangal_matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("INPUT ROW:");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        int i,j;
        System.out.println("INPUT VALUES OF MATRIX:");
        for(i=0;i<m;i++)
        {
            System.out.println("INPUT ROW VALUE  OF "+(i+1));
            for(j=0;j<m;j++)
            {
                System.out.println("\t INPUT VALUE:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("DISPLAY OF ARRAY LOWER TRIAGULAR MATRIX:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("DISPLAY OF ARRAY UPPER TRIAGULAR MATRIX:");
        for(i=m-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}