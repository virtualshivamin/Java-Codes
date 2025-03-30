import java.util.*;
class goldbach
{
    static int prime(int n)
    {
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return n;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an even number to check for goldbach");
        int n=sc.nextInt();
        int m=0;
        int a[]=new int[n];
        if(n%2==0)
        {
            for(int i=2;i<=n;i++)
            {
                if(prime(i)!=0)
                {
                    a[m]=i;
                    m++;
                }
            }
            for(int i=0;i<m-1;i++)
            {
                for(int j=i;j<m-1;j++)
                {
                    if((a[i]+a[j])==n)
                    {
                        System.out.println(n+"  "+"is a  "+"Goldbach Number");
                        System.exit(0);
                    }
                }
            }
            System.out.println(n+" is not a goldbach number");
        }
        else
        {
            System.out.println(n+" is not an even number");
        }
    }
}