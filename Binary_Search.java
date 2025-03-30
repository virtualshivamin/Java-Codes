import java.util.*;
class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,f,l,mid,n,key;
        System.out.println("Input size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for (i=0;i<n;i++)
        {
            System.out.println("INPUT A NO:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to find");
        key=sc.nextInt();
        f=0;
        l=n-1;
        mid=(f+l)/2;
        while(f<=l)
        {
            if ( arr[mid] < key )
            {
                f=mid + 1;
            }
            else if ( arr[mid] == key )
            {
                System.out.println(key + " found at location " + (mid + 1) + ".");
                break;
            }
            else
            {
                l = mid - 1;
            }
            mid=(f + l)/2;
        }
        if (f>l)
        {
            System.out.println(key + " isn't present in the list.\n");
        }
    }
}