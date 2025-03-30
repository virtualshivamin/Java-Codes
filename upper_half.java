import java.util.*;
class upper_half
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,v;
        System.out.println("input order of row and column");
        r=sc.nextInt();
        c=r;
        int a[][]=new int[r][c];
        v=0;
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
        for(i=r-1;i>=0;i--)
        {
            for(j=0;j<r;j++)
            {
                //if(v>0)
                //{
                    System.out.print("  "+"\t");
                //}
                //else
                //{
                    System.out.print(a[i][j]+"\t");
                //}
            }
            v++;
            System.out.println();
        }
    }
}