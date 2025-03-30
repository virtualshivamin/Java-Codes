class kite_pattern
{
    public static void main(String args[])
    {
        int i,j,k,ch=3;
        for(i=1;i<=4;i++)
        {
            for(k=1;k<=ch;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("a ");
            }
            System.out.println();
            ch--;
        }
        ch=1;
        for(i=3;i>0;i--)
        {
            for(k=1;k<=ch;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("a ");
            }
            System.out.println();
            ch++;
        }
    }
}