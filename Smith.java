import java.util.*;
class Smith
{
    public static void main(String args[])
    {
        int i, n, no,k = 0, s1 = 0, s2 = 0,d;
        int a[] = new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT A NO:");
        n=sc.nextInt();
        no=n;
        while(no != 0)
        {
            d=no%10;
            s1=s1+d;
            no=no/10;
        }
        no=n;
        for(i = 2; i < n; i++)
        {
            while (no % i == 0)
            {
                a[k] = i;
                k++;
                no=no/i;
            }
        }
        System.out.println("PRIME FACTRISATION:");
        for (i = 0; i < k; i++)
        {
            System.out.print(a[i] + " ");
        }
        for (i = 0; i < k; i++)
        {
            while (a[i] != 0)
            {
                d = a[i] % 10;
                s2=s2+d;
                a[i]=a[i]/10;
            }
        }
        System.out.println("Sum of digits of the number: " + s1);
        System.out.println("Sum of digits of the prime factors: " + s2);
        if (s1 == s2)
        {
            System.out.println(n+ " is a Smith Number.");
        }
        else
        {
            System.out.println(n+" is not a Smith Number.");
        }
    }
}