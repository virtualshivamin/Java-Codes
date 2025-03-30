import java.util.*;
class encryption
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,newstr="";
        System.out.println("INPUT A STRING:");
        str=sc.nextLine();
        int l,i;
        l=str.length();
        char ch;
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if((int)ch>=65 && (int)ch<90)
            {
                ch=ch+32;
            }
            else if(ch==90)
            {
                ch=64;
            }
            else if((int)ch>=97 && (int)ch<122)
            {
                ch=ch-32;
            }
            else if(ch==122)
            {
                ch=96;
            }
            newstr=newstr+(char)(ch+1);
        }
        System.out.println("OLD STRING="+str);
        System.out.println("NEW STRING="+newstr);
    }
}