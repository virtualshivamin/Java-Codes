import java.util.*;
public class ReverseFirstLastDigits
{
    static Scanner sc=new Scanner(System.in);
    public static int reverse(int input)
    {
        String str1,str2,temp;
        str1= String.valueOf(input);
        if (str1.length() == 1)
        {
            str2=str1;
        }
        else
        {
            char ch1,ch2;
            ch1=str1.charAt(0);
            ch2=str1.charAt(str1.length() - 1);
            temp=str1.substring(1,str1.length() - 1);
            str2=ch2+temp+ch1;
        }
        int ret;
        ret=Integer.parseInt(str2);
        return(ret);
    }
    public static void main(String args[])
    {
        int n1,n2;
        System.out.println("Enter a number: ");
        n1=sc.nextInt();
        System.out.println("original no is:"+n1);
        n2= reverse(n1);
        System.out.println("Output = " + n2);
    }
}