import java.util.*;
class menu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("INPUT 1 for area of circle....");
System.out.println("INPUT 2 for area of ractangle....");
System.out.println("INPUT 3 for area of triangle....");
System.out.println("");
System.out.println("");
double a,b,c;
int ch;
System.out.println("INPUT your choice......");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("INPUT radius of circle......");
a=sc.nextInt();
c=22/7*Math.sqrt(a);
System.out.println("area of circle="+c);
break;
case 2:
System.out.println("INPUT length......");
a=sc.nextInt();
System.out.println("INPUT bredth......");
b=sc.nextInt();
c=2*(a+b);
System.out.println("area of ractangle="+c);
break;
case 3:
double s;
System.out.println("INPUT first side......");
a=sc.nextInt();
System.out.println("INPUT second side......");
b=sc.nextInt();
System.out.println("INPUT third side......");
c=sc.nextInt();
s=(a+b+c)/2;
c=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area of triangle="+c);
break;
default:
System.out.println("INVALID CHOICE....");
System.out.println("PROGRAMMED BY SHIVAM SINGH....");
System.out.println("THANK YOU....");
}
}
}