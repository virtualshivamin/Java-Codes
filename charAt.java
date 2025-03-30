import java.util.*;
class charAt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
int a;
System.out.println("input string value");
str=sc.nextLine();
System.out.println("input integer value");
a=sc.nextInt();
char s;
s=str.charAt(a-1);
System.out.println(s);
}
}