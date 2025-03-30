import java.util.*;
class evil_no
{
    static int count_one(int n)
    {
        int c_one = 0;
        while (n != 0)
        {
            int rem = n % 10;
            if (rem == 1)
            {
                c_one = c_one + 1;
            }
            n = n / 10;
        }
        return(c_one);
    }
    static int checkEvil(int n)
    {
        int i = 0, bin = 0, n_one = 0;
        while (n != 0)
        {
            int r = n % 2;
            bin = bin + r * (int)(Math.pow(10, i));
            n = n / 2;
        }
        n_one = count_one(bin);
        if (n_one % 2 == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i, check, num;
        System.out.println("INPUT A NO:");
        num=sc.nextInt();
        check = checkEvil(num);
        if (check == 1)
        {
            System.out.println(num + " is Evil Number");
        }
        else
        {
            System.out.println(num + " is Not Evil Number");
        }
    }
}