import java.util.*;
class character
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i;
char b;
for(i=1;i<=15;i++)
{
System.out.println("INPUT DIGIT....");
a=sc.nextInt();
System.out.println("THE DIGIT SHOWS....");
b=(char)a;
System.out.println(b);
}
}
}