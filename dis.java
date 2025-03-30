import java.util.*;
class dis
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double pp,pq,amt,dis,fp;
double d;
System.out.println("INPUT PRODUCT PRICE...");
pp=sc.nextInt();
System.out.println("INPUT PRODUCT QUANTITY...");
pq=sc.nextInt();
amt=pp*pq;
if(amt>500)
{
d=(5/amt)*100;
}
else
{
d=0;
}
fp=amt-d;
System.out.println("product price:"+pp);
System.out.println("product quantity:"+pq);
System.out.println("amount:"+amt);
System.out.println("discount:"+d);
System.out.println("final price:"+fp);
System.out.println("thank you");
}
}