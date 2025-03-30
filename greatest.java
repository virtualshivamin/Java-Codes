import java.util.*;
class greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double bs,d,h,g;
System.out.println("INPUT BASIC SALARY");
bs=sc.nextInt();
if(bs<4000)
{
d=(30/100)*bs;
h=(20/100)*bs;
g=bs+d+h;
System.out.println("BASIC SALARY="+bs);
System.out.println("D.A="+d);
System.out.println("H.R.A="+h);
System.out.println("GROSS SALARY="+g);
}
if(bs>=4001)
{
if(bs<=7000)
{
d=(45/100)*bs;
h=(30/100)*bs;
g=bs+h+d;
System.out.println("BASIC SALARY="+bs);
System.out.println("D.A="+d);
System.out.println("H.R.A="+h);
System.out.println("GROSS SALARY="+g);
}
}
if(bs>=7001)
{
if(bs<=10000)
{
d=(65/100)*bs;
h=(40/100)*bs;
g=bs+h+d;
System.out.println("BASIC SALARY="+bs);
System.out.println("D.A="+d);
System.out.println("H.R.A="+h);
System.out.println("GROSS SALARY="+g);
}
}
else
{
d=(80/100)*bs;
h=(50/100)*bs;
g=bs+h+d;
System.out.println("BASIC SALARY="+bs);
System.out.println("D.A="+d);
System.out.println("H.R.A="+h);
System.out.println("GROSS SALARY="+g);
}
System.out.println("THANK'S YOU");
}
}