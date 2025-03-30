import java.util.*;
class buzz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,ch,d;
        System.out.println("Input a no");
        n=sc.nextInt();
        d=n;
        System.out.println("Press 1 to check BUZZ no");
        System.out.println("Press 2 to print factorial");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
                if(d%7==0)
                {
                    System.out.println(n+"is BUZZ No");
                }
                else if(d%10==7)
                {
                    System.out.println(n+"is BUZZ No");
                }
                else
                {
                    System.out.println(n+"is not BUZZ No");
                }
                break;
            case 2:
                int a=1;
                for(int i=d;i>0;i--)
                {
                    a=a*i;
                }
                System.out.println("Factorial of "+n+" is "+a);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}