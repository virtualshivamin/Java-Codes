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
            System.out.println("input row"+(i+1)+"value");
            for(j=0;j<4;j++)
            {
                System.out.println("input no:");
                a[i][j]=sc.nextInt();
            }
       }
       for(i=0;i<4;i++)
       {
            System.out.println("input row"+(i+1)+"value");
            for(j=0;j<4;j++)
            {
                System.out.println("input no:");
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
      System.out.println("DISPLAY OF MATRIX 1");
      for(i=0;i<4;i++)
      {
          for(j=0;j<4;j++)
          {
              System.out.print(a[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("DISPLAY OF MATRIX 1");
      for(i=0;i<4;i++)
      {
          for(j=0;j<4;j++)
          {
              System.out.print(a[i][j]+"\t");
          }
          System.out.println();
      }
    }
}   