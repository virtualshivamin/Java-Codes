import java.util.*;
class a_reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b[]=new int[2];
int i,d,j;
for(i=0;i<10;i++)
{
System.out.println("INPUT NUMBER....");
a[i]=sc.nextInt();
}
b[0]=a[0];
b[1]=a[9];
System.out.println("FIRST NO.="+b[1]);
System.out.println("LAST NO."+b[0]);
System.out.println("PROGRAMMED BY SHIVAM SINGH....");
}
}