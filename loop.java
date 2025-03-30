class loop
{
public static void main(String args[])
{
int size,s,i,j,sp;
size=5;
sp=8;
for(s=1;s<=size;s++)
{
for(i=1;i<=s;i++)
{
System.out.print("*");
}
for(j=sp;j>=1;j--)
{
System.out.print(" ");
}
for(i=1;i<=s;i++)
{
System.out.print("*");
}
System.out.println("");
sp-=2;
}
}
}


