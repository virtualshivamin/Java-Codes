package abc;
import java.util.*;
public class reverse
{
static Scanner sc=new Scanner(System.in);
static int n,rev;
public static void getData()
{
System.out.println("INPUT A NUMBER:");
n=sc.nextInt();
rev=0;
}
public static void reverseconvert()
{
int c,d;
d=n;
while(d>0)
{
c=d%10;
rev=(rev*10)+c;
d=d/10;
}
}
public static void display()
{
System.out.println("GIVEN NUMBER=  "+n);
System.out.println("rev NUMBER=  "+rev);
System.out.println();
System.out.println();
System.out.println("PROGRAMMED BY SHIVAM SINGH....");
}
public static void shivam()
{
System.out.println("thank you");
}
public static void main(String args[])
{
getData();
reverseconvert();
display();
shivam();
}
}