import java.util.*;
class pratical_ques
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT SIZE OF SQUARE MATRIX:");
        System.out.println("SIZE MUST BE GREATER THAN 3 AND SMALLER THAN 10");
        int m=sc.nextInt();
       if(m>3&&m<10)
       {
        int arr[][]=new int[m][m];
        int i,j,v;
        for(i=0;i<m;i++)
        {
            System.out.println("INPUT POSITIVE NUMBER FOR ROW:"+(i+1));
            for(j=0;j<m;j++)
            {
                System.out.println("INPUT POSITIVE NUMBER FOR COLUMN:"+(j+1));
                v=sc.nextInt();
                if(v%2==0)
                {
                    arr[i][j]=v;
                }
                else
                {
                    System.out.println("INVALID INPUT TRY AGAIN:");
                    arr[i][j]=sc.nextInt();
                }
            }
        }
        System.out.println("DISPLAY OF ORIGINAL MATRIX:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int k,l,t;
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                for(k=i;k<m;k++)
                {
                    for(l=0;l<m;l++)
                    {
                        if(i!=0&&j!=0&&i!=(m-1)&&j!=(m-1)&&k!=0&&l!=0&&k!=(m-1)&&l!=(m-1))
                        {
                            if(arr[i][j]>arr[k][l])
                            {
                                t=arr[i][j];
                                arr[i][j]=arr[k][l];
                                arr[k][l]=t;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("DISPLAY OF SHORTED MATRIX:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("DISPLAY OF PRINCIPAL DIAGONAL OF MATRIX:");
        k=1;
        l=m-1;
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                   System.out.print(arr[i][j]);
                if(k-j==0)
                   System.out.print(arr[k][l]);
                else
                System.out.print("\t");
                k++;
                l--;
            }
            System.out.println();
        }
       }
       else
       {
           System.out.println("INVALID INPUT:");
       }
    }
}