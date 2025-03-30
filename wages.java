import java.util.*;
public class wages extends worker
{
    int hr;
    double rate,wage;
    wages(String n,double b,int h,double r)
    {
        super(n,b);
        hr=h;
        rate=r;
    }
    double overtime()
    {
        return(hr*rate);
    }
    void display()
    {
        super.display();
        wage=basic+overtime();
        System.out.println("OVERTIME Hr = "+hr);
        System.out.println("RATE = "+rate);
        System.out.println("Wage = "+wage);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT NAME :");
        String str=sc.nextLine();
        System.out.println("INPUT BASIC SALARY :");
        double bas=sc.nextInt();
        System.out.println("OVERTIME HOURS : ");
        int hh=sc.nextInt();
        System.out.println("INPUT RATE :");
        int ra=sc.nextInt();
        wages obj=new wages(str,bas,hh,ra);
        obj.display();
    }
}