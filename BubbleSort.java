import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n, i, j, temp;
        System.out.println("INPUT SIZE OF ARRAY:");
        n=sc.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++)
        {
            System.out.println("INPUT A NO.");
            arr[i] =sc.nextInt();
        }
        for (i = 0; i < ( n - 1 ); i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("DISPLAY OF SHORTED ELEMENT:");
        for (i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}