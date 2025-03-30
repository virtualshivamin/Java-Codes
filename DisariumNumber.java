import java.util.*;
public class DisariumNumber  
{
    public static int calculateLength(int n)
    {  
        int length = 0;  
        while(n != 0)
        {  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        int num = 175, sum = 0, rem = 0, n;
        System.out.println("INPUT A NO:");
        num=sc.nextInt();
        int len = calculateLength(num);
        n = num;
        while(num > 0)
        {  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  
            num = num/10;  
            len--;  
        }
        if(sum == n)
        {
            System.out.println(n + " is a disarium number");  
        }
        else
        {
            System.out.println(n + " is not a disarium number");  
        }
    }  
}