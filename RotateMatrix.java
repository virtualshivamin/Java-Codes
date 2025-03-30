import java.util.*;
public class RotateMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("INPUT SIZE OF MATRIX:");
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print("INPUT NO:");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original Matrix:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("ROTATED MATRIX:");
        int[][] dubl= new int[n][n];
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                dubl[j][(n-1)-i]=arr[i][j]; 
            }
        }
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print(dubl[i][j] + "   ");
            }
            System.out.println();
        }
    }
}