import java.util.*;
class triangle_area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        System.out.println("INPUT SIDE:");
        a=sc.nextDouble();
        System.out.println("INPUT SIDE:");
        b=sc.nextDouble();
        System.out.println("INPUT SIDE:");
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA="+area);
    }
}