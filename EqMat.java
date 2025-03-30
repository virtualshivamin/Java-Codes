import java.util.*;
class EqMat
{
    private int a[][];
    private int m,n;
    public EqMat(int mm,int nn)
    {
        this.m=mm;
        this.n=nn;
        a=new int[m][n];
    }
    public void readarray()
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<this.m;i++)
        {
            System.out.println("INPUT ROW NO : "+(i+1));
            for(j=0;j<this.n;j++)
            {
                System.out.println("INPUT VALUE : ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void print()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public int check(EqMat P,EqMat Q)
    {
        int i,j,x=1;
        if(P.m==Q.m && P.n==Q.n)
        {
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(P.a[i][j] != Q.a[i][j])
                    {
                        x=0;
                        break;
                    }
                }
            }
            return(x);
        }
        else
        {
            return(0);
        }
    }
    public static void main(String args[])
    {
        EqMat obj1=new EqMat(2,2);
        EqMat obj2=new EqMat(3,3);
        obj1.readarray();
        obj2.readarray();
        obj1.print();
        obj2.print();
        int x=obj1.check(obj1,obj2);
        if(x==1)
        {
            System.out.println("BOTH ARRAY ARE EQUAL : ");
        }
        else
        {
            System.out.println("NOT EQUAL : ");
        }
    }
}