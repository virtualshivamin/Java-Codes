public class worker
{
    String name;
    double basic;
    worker(String nm,double bs)
    {
        name=nm;
        basic=bs;
    }
    void display()
    {
        System.out.println("NAME = "+name);
        System.out.println("BASIC = "+basic);
    }
}