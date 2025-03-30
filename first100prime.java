import java.util.*;
class first100prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,c1=0,c2=0,j;
        System.out.println("FIRST 100 PRIME NO.");
        for(i=2;c2<100;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c1++;
                }
            }
            if(c1==2)
            {
                c2++;
                System.out.println(c2+" -> "+i);
            }
            c1=0;
        }
    }
}