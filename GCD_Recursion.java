import java.util.*;
public class GCD_Recursion
{
    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
        {
            return gcd(n2, n1 % n2);
        }
        else
        {
            return(n1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,result;
        System.out.println("INPUT A NO:");
        n1=sc.nextInt();
        System.out.println("INPUT A NO:");
        n2=sc.nextInt();
        result=gcd(n1, n2);
        System.out.println("G.C.D of  "+n1+" and "+n2+" is "+result);
    }
}