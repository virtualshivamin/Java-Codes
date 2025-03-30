import java.util.*;
class FrequencyFinder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,d,p,i,c,num;
        System.out.println("INPUT A NUMBER:");
        num=sc.nextInt();
        m=num;
        System.out.println("Number entered is "+num);
        for(i = 1;i<=9;i++)
        {
            m=num;
            c=0;
            while(m>0)
            {
                d=m%10;
                if(d==i)
                {
                    c++;
                    p=d;
                }
                m/=10;
            }
            if(c>=1)
            {
                System.out.println("Frequency of "+i+" is "+c);
            }
        }
        System.out.println("\n");
    }
}