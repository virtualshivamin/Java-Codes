/*
QUESTION 1 : 

ISC SPECIMEN PAPER 2020 [ COMPUTER PAPER 2 (PRACTICAL , PROJECT & FILE ) ]

An Evil number is a positive whole number which has even number of 1’s in its binary equivalent.
Example: Binary equivalent of 9 is 1001, which contains even number of 1’s.
Thus, 9 is an Evil Number.
A few Evil numbers are 3, 5, 6, 9....
Design a program to accept a positive whole number ‘N’ where N>2 and N<100. Find the binary
equivalent of the number and count the number of 1s in it and display whether it is an Evil number or
not with an appropriate message.
Test your program with the following data and some random data:
Example 1:
INPUT: N = 15
BINARY EQUIVALENT: 1111
NUMBER OF 1’s: 4
OUTPUT: EVIL NUMBER
Example 2:
INPUT: N = 26
BINARY EQUIVALENT: 11010
NUMBER OF 1’s: 3
OUTPUT: NOT AN EVIL NUMBER
Example 3:
INPUT: N = 145
OUTPUT: NUMBER OUT OF RANGE�
 
   */
import java.util.*;
class binary_equivalance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("INPUT A NO:");
        n=sc.nextInt();
        if(n>2 && n<100)
        {
            int t,r,count=0;
            String b="";
            t=n;
            while(t>0)
            {
                r=t%2;
                if(r==1)
                {
                    count++;
                }
                b=r+b;
                t=t/2;
            }
            System.out.println("GIVEN NO : " +n);
            System.out.println("BINARY OF GIVEN NUMBER : " +b);
            System.out.println("NUMBER OF 1's : " +count);
            if(count%2==0)
            {
                System.out.println("EVIL NUMBER.");
            }
            else
            {
                System.out.println("NOT AN EVIL NUMBER.");
            }
        }
        else
        {
            System.out.println("NUMBER OUT OF RANGE.");
        }
    }
}