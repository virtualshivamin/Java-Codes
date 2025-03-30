class pattern4
{
    public static void main(String args[])
    {
        int i,j,k,l;
        for(i=1;i<5;i++)
        {
            for(k=4;k>0;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<2*i-1;j++)
            {
                System.out.print(j+" ");
            }
            for(l=1;l<1;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}