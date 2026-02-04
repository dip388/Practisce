package InterimCodes;

import java.util.Scanner;

public class RemoveDuplicateString {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.nextLine();

        String result="";

        for(int i=0;i<str.length();i++)
        {
            String ch=""+str.charAt(i);

            if(result.contains(ch))
            {
                continue;
            }
            else {
                result=result+ch;
            }

        }
        System.out.println(result);
    }
}
