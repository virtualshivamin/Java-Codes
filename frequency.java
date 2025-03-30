import java.util.*;
class frequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
char c=' ',a='a',e='e',i='i',o='o',u='u';
int j,k,l,countA=0,countE=0,countI=0,countO=0,countU=0;
for(j=0;j<3;j++)
{
System.out.println("INPUT STRING VALUE:");
str=sc.nextLine();
str=str.toUpperCase();
l=str.length();
for(k=0;k<l;k++)
{
c=str.charAt(i);
if(c==a)
{
countA++;
}
if(str.compareTo(e)==0)
{
countE++;
}
if(str.compareTo(i)==0)
{
countI++;
}
if(str.compareTo(o)==0)
{
countO++;
}
if(str.compareTo(u)==0)
{
countU++;
}
}
System.out.println("FREQUENCY OF:");
System.out.println("A="+countA);
System.out.println("E="+countE);
System.out.println("I="+countI);
System.out.println("O="+countO);
System.out.println("U="+countU);
}
}
}