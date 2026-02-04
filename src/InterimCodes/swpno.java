package InterimCodes;

import java.util.Scanner;

public class swpno {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String s=sc.nextLine();
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
            result=result+s.charAt(i);

        }
        if(result.equals(s))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }


    }
}
