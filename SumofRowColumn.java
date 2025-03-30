import java.util.*;
public class SumofRowColumn    
{    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r, c, sum1, sum2,i,j;
        System.out.println("INPUT ROW :");
        r=sc.nextInt();
        System.out.println("INPUT COLUMN :");
        c=sc.nextInt();
        int a[][]=new int [r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                System.out.println("INPUT NUMBER :");
                a[i][j]=sc.nextInt();
            }  
        }
        System.out.println("DISPLAY OF MATRIX:");
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i = 0; i < r; i++)
        {    
            sum1 = 0;    
            for(j = 0; j < c; j++)
            {    
              sum1 = sum1 + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sum1);    
        }
        for(i = 0; i < c; i++)
        {    
            sum2 = 0;    
            for(j = 0; j < r; j++)
            {    
              sum2 = sum2 + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sum2);    
        }    
    }    
}    