import java.util.*;
class cise
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int a=0;a<5;a++)
{
System.out.println("INPUT A SENTENCE");
String s=sc.nextLine();
String sw="";
int l=s.length();
char ch;
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
if((int)ch>=65&&(int)ch<=90)
{
ch=(char)(ch+32);
sw=sw+ch;
}
else if((int)ch>=65&&(int)ch<=90)
{
ch=(char)(ch-32);
sw=sw+ch;
}
}
System.out.println("FIRST SENTENCE ="+"\t"+s);
System.out.println("SECOND SENTENCE="+"\t"+sw);
}
}
}