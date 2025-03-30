import java.util.*;
class shortname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="",temp="",name="";
        System.out.println("INPUT A NAME : ");
        str=sc.nextLine();
        int l,i,j,len;
        l=str.length();
        len=l;
        char ch,ch1;
        for(i=l-1;i>0;i--)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                str1=ch+str1;
            }
            else
            {
                break;
            }
        }
        temp=temp+str.charAt(0);
        for(j=0;j<i;j++)
        {
            ch1=str.charAt(j);
            if(ch1==' ')
            {
                temp=temp+"."+(str.charAt(j+1));
            }
        }
        name=str1+","+temp+".";
        System.out.print("SHORT NAME = "+name);
    }
}