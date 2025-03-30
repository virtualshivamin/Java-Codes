class pattern6
{
   public static void main(String args[])
   {
        int i,j,ch;
        int h;
        for(i=7;i>0;i--)
        {
            h=71;
            for(ch=0;ch<(7-i);ch++)
            {
                 System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                 System.out.print((char)h+" ");
                 h--;
            }
            System.out.println();
        }
   }
}