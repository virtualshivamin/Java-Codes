import java.util.*;
class pn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,count=0;
System.out.println("Input a no ");
n=sc.nextInt();
i=1;
while(i<=n)
{
if(i%n==0)
{
count++;
}
++i;
}
if(count==2)
{
System.out.println("THE GIVEN NUMBER IS PRIME NUMBER");
}
else
{
System.out.println("THE GIVEN NUMBER IS NOT A PRIME NUMBER");
}
}
}