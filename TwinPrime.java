import java.util.*;
public class TwinPrime
{
    public static boolean is_Prime(int n)
    {
        int i;
        if(n<2)
        {
            return(false);
        }
        for (i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return(false);
            }
        }
        return(true);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("INPUT TERM:");
        n=sc.nextInt();
        for (i=2;i<n;i++)
        {
            if(is_Prime(i)&&is_Prime(i + 2))
            {
                System.out.println("("+i+","+(i+2)+")");
            }
        }
    }
}