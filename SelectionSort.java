import java.util.*;
public class SelectionSort 
{  
   public static void main(String args[])  
   {  
       int n, i, j, temp;   
       Scanner sc= new Scanner(System.in);
       System.out.print("ENTER ARRAY SIZE : ");  
       n=sc.nextInt(); 
       int arr[] = new int[n];
       for(i=0; i<n; i++)  
       {  
           System.out.print("INPUT A NO : ");  
           arr[i] = sc.nextInt();  
       }
       for(i=0; i<n; i++)  
       {  
           for(j=i+1; j<n; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }
       System.out.println("ARRAY AFTER SORTING:");  
       for(i=0; i<n; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}