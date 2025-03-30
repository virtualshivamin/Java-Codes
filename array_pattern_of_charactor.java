//Posted by techanalysiscontroversy
/*
QUESTION 3 : ISC SPECIMEN PAPER 2020 [ COMPUTER PAPER 2 (PRACTICAL , PROJECT & FILE ) ]
Write a program to declare a square matrix M [ ] [ ] of order ‘N’ where ‘N’ must be greater than 3
and less than 10. Allow the user to accept three different characters from the keyboard and fill the
array according to the instruction given below:
(i) Fill the four corners of the square matrix by character 1.
(ii) Fill the boundary elements of the matrix (except the four corners) by character 2.
(iii) Fill the non-boundary elements of the matrix by character 3.
Test your program with the following data and some random data:
Example 1:
INPUT: N = 4
FIRST CHARACTER: @
SECOND CHARACTER: ?
THIRD CHARACTER: #
OUTPUT: 
@ ? ? @
? # # ?
? # # ?
@ ? ? @
Example 2:
INPUT: N = 5
FIRST CHARACTER: A
SECOND CHARACTER: C
THIRD CHARACTER: X
OUTPUT: 
A C C C A
C X X X C
C X X X C
C X X X C
A C C C A
  */
import java.util.*;
class array_pattern_of_charactor
{
    public static void main (String args [] )
    {
        Scanner sc=new Scanner (System.in);
        int n,i,j;
        String a,b,c;
        System.out.println("INPUT SIZE OF ARRAY :");
        n=sc.nextInt();
        System.out.println("INPUT FIRST CHARACTOR :");
        a=sc.next();
        System.out.println("INPUT SECOND CHARACTOR :");
        b=sc.next();
        System.out.println("INPUT THIRD CHARACTOR :");
        c=sc.next();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if( i==0 || i==n-1 || j==0 || j==n-1 )
                {
                    if( i==0 &&j==0 || i==0 && j==n-1 || i==n-1 && j==0 || i==n-1 && j==n-1 )
                    {
                        System.out.print(a+"\t");
                    }
                    else
                    {
                        System.out.print(b+"\t");
                    }
                }
                else
                {
                    System.out.print(c+"\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}