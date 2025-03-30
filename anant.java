import java.util.*;
class anant
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int temp[]=new int[10];
int i,j,pr=0,count=0;
for(i=0;i<10;i++)
{
System.out.println("input no....");
a[i]=sc.nextInt();
}
for(i=0;i<10;i++)
{
pr=0;
for(j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
pr++;
}
if(j==a[i])
{
if(pr==2)
{
temp[count]=a[i];
count++;
}
}
}
}
int b[]=new int [count];
for(i=0;i<count;i++)
{
b[i]=temp[i];
}
for(i=0;i<10;i++)
{
System.out.println("display of array:  "+a[i]);
}
for(i=0;i<b.length;i++)
{
System.out.println("display of prime number:  "+b[i]);
}
}
}