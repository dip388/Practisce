import java.util.*;
import java.util.Scanner;

public class StringReverse {

    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String ");
        String s=sc.nextLine();

        String word[]=s.split(" ");
        for(String words:word)
        {
            for(int i=words.length()-1;i>=0;i--)
            {
                System.out.print(words.charAt(i));
            }
            System.out.println();
        }
    }
}
