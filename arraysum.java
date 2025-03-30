import java.util.*;
class arraysum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int i,sum=0;
for(i=0;i<10;i++)
{
System.out.println("INPUT THE NO....");
a[i]=sc.nextInt();
if(a[i]%2==0)
{
sum=sum+a[i];
}
else
{
sum=sum;
}
}
System.out.println("SUM OF EVEN NO....="+sum);
System.out.println("PROGRAMMED BY SHIVAM SINGH....");
}
}