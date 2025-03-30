import java.util.*;
class frequency1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
char c,ch;
int l,k,count=0;
System.out.println("INPUT STRING VALUE:");
str=sc.nextLine();
System.out.println("INPUT charactor VALUE:");
ch=sc.next();
str=str.toUpperCase();
l=str.length();
for(k=0;k<l;k++)
{
c=str.charAt(k);
if(c==ch)
{
count++;
}
}
System.out.println("FREQUENCY:"+count);
}
}