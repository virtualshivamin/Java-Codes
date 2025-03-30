import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ul,ll,i,n,s,r;
System.out.println("INPUT UPPER LIMIT....");
ul=sc.nextInt();//for upper lmit value
System.out.println("INPUT LOWER LIMIT....");
ll=sc.nextInt();//for lower limit value
for(i=ll;i<=ul;i++)
{
    s=0;
    n=i;
    while(n>0)
    {
        r=n%10;
        s=s+(r*r*r);
        n=n%10;
    }
    if(i==s)
    {
        System.out.println(i+"is armstrong no....");
    }
    else
    {
        System.out.println(i+"is not armstrong no....");
    }
}
int a,t;
System.out.println("input a number....");
a=sc.nextInt();
for(t=0;t<=10;t++)
{
    System.out.println(a);
    System.out.println(a);
    System.out.println(a);
    System.out.println(a);
    System.out.println(a);
    System.out.println("Thank's programmed by shivam singh....");
    System.out.print(" ");
}//for loop close
}//main close
}//class close