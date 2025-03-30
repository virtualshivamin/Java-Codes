import java.util.*;
class fibonacci_without_recursion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,i,n,sum;
        System.out.println("INPUT TERM:");
        n=sc.nextInt();
        a=0;
        b=1;
        sum=a+b;
        System.out.print(a+ ","+b+",");
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            sum=sum+c;
            a=b;
            b=c;
        }
        System.out.print("\n SUM= "+sum);
    }
}