class p1
{
public static void main(String args [])
{
int size=5,s,j,i,sp=4;
for(s=1;s<size;s++)
{
for(i=1;i<=size;i++)
{
System.out.print("*");
}
for(j=sp;j>1;j--)
{
System.out.print(" ");
}
for(i=1;i<=5;i++)
{
System.out.print("*");
}
System.out.println("");
sp--;
}
sp=1;
for(s=size;s>=1;s--)
{
for(i=1;i<=s;i++)
{
System.out.print("*");
}
for(j=sp;j>1;j--)
{
System.out.print(" ");
}
for(i=s;i>=1;i--)
{
System.out.print("*");
}
System.out.println("");
sp++;
}
}
}