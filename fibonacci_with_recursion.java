import java.util.*;
class fibonacci_with_recursion
{
    Scanner sc=new Scanner(System.in);
    int a=0,b=1,c=0,sum=1;
    void fibo(int n)
    {
        if(n>0)
        {
            c=a+b;
            sum=sum+c;
            a=b;
            b=c;
            fibo(n-1);
        }
        else
        {
            System.out.println("SUM OF SERIES="+sum);
        }
    }
    public void main(String args[])
    {
        int t;
        System.out.println("INPUT TERM OF FIBONCCI SERIES:");
        t=sc.nextInt();
        fibo(t-2);
    }
}