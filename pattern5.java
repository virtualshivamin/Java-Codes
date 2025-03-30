class pattern5
{
   public static void main(String args[])
   {
        int i,j,ch;
        char h;
        for(i=7;i>0;i--)
        {
            h='G';
            for(ch=0;ch<(7-i);ch++)
            {
                 System.out.print("  ");
            }
            for(j=0;j<i;j++)
            {
                 System.out.print(h+" ");
                 h=(char)((int)h-1);
            }
            System.out.println();
        }
        
   }
}