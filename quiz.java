import java.util.*;
class quiz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is java");
        int a;
        System.out.println("1-software");
        System.out.println("2-coffee");
        System.out.println("input ans");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("wrong");
        }
    }
}