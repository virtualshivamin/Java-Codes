import java.util.*;
public class Frequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        str=str.toUpperCase();
        int[] frequency = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int in = ch - 65;
            frequency[in]++;
        }
        System.out.println("Character - Frequency");
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 65) + " " + frequency[i]);
        }
    }
}