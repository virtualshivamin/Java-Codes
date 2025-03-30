import java.util.*;
class decode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,nstr="";
        char ch;
        int i,l,k;
        System.out.println("INPUT WORD:");
        str=sc.next();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            k=(int)ch;
            if(Character.isUpperCase(ch)==true)
            {
                ch=Character.toLowerCase(ch);
                k++;
            }
            else
            {
                ch=Character.toUpperCase(ch);
                k++;
            }
            nstr=nstr+(char)k;
           }
        System.out.println("GIVEN WORD :  "+str);
        System.out.println("NEW WORD :  "+nstr);
    }
}