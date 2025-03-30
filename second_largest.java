import java.util.*;
class second_largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,l,sl;
        System.out.println("input order of row:");
        r=sc.nextInt();
        System.out.println("input order of column:");
        c=sc.nextInt();
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            System.out.println("INPUT FOR ROW"+(i+1));
            for(j=0;j<+c;j++)
            {
                System.out.println("INPUT NO:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("DISPLAY OF MATRIX:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("DISPLAY OF MATRIX:");
        l=a[0][0];
        sl=a[0][0];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j]>l)
                {
                   sl=l;
                   l=a[i][j];
                }
                else if(a[i][j]>sl)
                {
                    sl=a[i][j];
                }
            }
        }
        System.out.println("LARGEST NO: " +l);
        System.out.println("SECOND LARGEST NO: " +sl);
    }
}