import java.util.*;
class compound_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,p,r,t;
        double a=0;
        System.out.println("INPUT PRINCIPAL AMOUNT :");
        p=sc.nextInt();
        System.out.println("INPUT RATE :");
        r=sc.nextInt();
        System.out.println("INPUT YEARS :");
        t=sc.nextInt();
        System.out.println("PRINCIPAL"+" RATE"+" YEAR"+" AMOUNT");
        for(i=1;i<=t;i++)
        {
            a=Math.pow(p*(1+r/100),i);
            System.out.println(p+"\t"+r+"\t"+i+"\t"+a);
            a=0;
        }
    }
}