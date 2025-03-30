import java.util.*;
class BIGGEST
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("INPUT FIRST NUMBER....");
a=sc.nextInt();
System.out.println("INPUT SECOND NUMBER....");
b=sc.nextInt();
System.out.println("INPUT THIRD NUMBER....");
c=sc.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("FIRST NUMBER IS GREATER....");
}
else
{
System.out.println("THIRD NUMBER IS GREATER....");
}
}
else
{
if(b>c)
{
System.out.println("SECOND NUMBER IS GREATER....");
}
else
{
System.out.println("THIRD NUMBER IS GREATER....");
}
}
}
}