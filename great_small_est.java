import java.util.*;
class great_small_est
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[25];
int i,max,min;
for(i=0;i<25;i++)
{
System.out.println("input no....");
a[i]=sc.nextInt();
}
System.out.println("display of array...");
for(i=0;i<25;i++)
{
System.out.println(a[i]);
}
min=a[0];
max=a[0];
for(i=0;i<25;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("largest no...."+max);
System.out.println("smallest no...."+min);
}
}