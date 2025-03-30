import java.util.*;
class distance_formula
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1,x2,y1,y2;
        double d;
        System.out.println("Input value of x1");
        x1=sc.nextInt();
        System.out.println("Input value of x2");
        x2=sc.nextInt();
        System.out.println("Input value of y1");
        y1=sc.nextInt();
        System.out.println("Input value of y2");
        y2=sc.nextInt();
        d=Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2));
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("y1 = "+y1);
        System.out.println("y2 = "+y2);
        System.out.println("distance = "+d);
    }
}