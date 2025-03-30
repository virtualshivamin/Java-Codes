import java.util.*;
public class Paragraph
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String prg;int start=0;int len=0,l;
        int cnt=1,bgn=0,lst=0;
        String str="",temp="";
        char chh=' ';
        int ltr=0,tmp;
        System.out.println("Enter Paragraph:");
        prg=sc.nextLine();
        len=prg.length();
        int count []= new int[len];
        String lttr [] = new String [len];
        int indx=0;
        char ch=' ';
        for(int i=0;i<len;i++)
        {
            ch=prg.charAt(i);
            if(ch=='?'||ch=='!'||ch=='.')
            {
                str=prg.substring(bgn,i);
                str=str.trim();
                l=str.length();
                for(int j=0;j<l;j++)
                {
                    chh=str.charAt(j);
                    if(chh==' '||chh=='?'||chh=='!'||chh=='.')
                    cnt++;//count no. of letters
                }
                lttr[indx]=str;
                count[indx]=cnt;
                indx++;
                bgn=i+1;
                str="";
                cnt=1;
            }
        }
        for(int i=0;i<indx;i++)
        {
             for(int k=i+1;k<indx;k++)
             {
                if(lttr[i].compareTo(lttr[k])>0)
                {
                    temp=lttr[i];
                    lttr[i]=lttr[k];
                    lttr[k]=temp;
                    tmp=count[i];
                    count[i]=count[k];
                    count[k]=tmp;
                }
             }
        }
        for(int i=0;i<indx;i++)
        {
            System.out.println(lttr[i]+"="+count[i]);
        }
    }
} 