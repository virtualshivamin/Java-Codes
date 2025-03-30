import java.util.*;
public class RemoveDuplicateElements
{
	public static int[] removeDuplicates(int[] input)
	{
		int j = 0;
		int i = 1;
		if (input.length < 2)
		{
			return input;
		}
		while (i < input.length)
		{
			if (input[i] == input[j])
			{
				i++;
			}
			else
			{
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++)
		{
			output[k] = input[k];
		}
		return output;
	}
	public static void main(String a[])
	{
	        Scanner sc=new Scanner(System.in);
	        int s,j;
	        System.out.println("Input size of array:");
	        s=sc.nextInt();
		int input1[]=new int[s];
	        for(j=0;j<s;j++)
	        {
	            System.out.println("Input no:");
	            input1[j]=sc.nextInt();
	        }
		int[] output = removeDuplicates(input1);
		System.out.print("Input Elements: \n");
		for (int i : input1)
		{
			System.out.print(i + " ");
		}
		System.out.print("\nOutput Elements: \n");
		for (int i : output)
		{
			System.out.print(i + " ");
		}
	}
}