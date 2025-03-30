import java.util.*;
class calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("INPUT 1 for ADD....");
System.out.println("INPUT 2 for SUBTRACT....");
System.out.println("INPUT 3 for MULTIPLY....");
System.out.println("INPUT 4 for DIVIDE....");
System.out.println("INPUT 5 for PERCENTAGE....");
System.out.println("INPUT 6 for SQUARE ROOT....");
System.out.println("INPUT 7 for CUBE ROOT....");
System.out.println("INPUT 8 for TO CALCULATE THE GIVEN NUMBER AND POWER OF GIVEN NUMBER....");
System.out.println("");
System.out.println("");
double c;
int a,b,ch;
System.out.println("INPUT your choice......");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT second number......");
b=sc.nextInt();
c=a+b;
System.out.println("ADDITION="+c);
break;
case 2:
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT second number......");
b=sc.nextInt();
c=a-b;
System.out.println("SUBTRACTION="+c);
break;
case 3:
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT second number......");
b=sc.nextInt();
c=a*b;
System.out.println("MULTIPLY="+c);
break;
case 4:
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT second number......");
b=sc.nextInt();
c=a/b;
System.out.println("DIVIDE="+c);
break;
case 5:
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT second number......");
b=sc.nextInt();
c=a/b*100;
System.out.println("PERCENTAGE="+c);
break;
case 6:
System.out.println("INPUT first number......");
a=sc.nextInt();
c=Math.sqrt(a);
System.out.println("SQUARE ROOT="+c);
break;
case 7:
System.out.println("INPUT first number......");
a=sc.nextInt();
c=Math.pow(a,3);
System.out.println("CUBE ROOT="+c);
break;
case 8:
int x;
System.out.println("INPUT first number......");
a=sc.nextInt();
System.out.println("INPUT power value......");
x=sc.nextInt();
c=Math.pow(a,x);
System.out.println("The given value power solution="+c);
break;
default:
System.out.println("INVALID CHOICE....");
System.out.println("PROGRAMMED BY SHIVAM SINGH....");
System.out.println("THANK YOU....");
}
}
}