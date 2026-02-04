package InterimCodes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurance {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

      System.out.println("Enter the String: ");
        String s=sc.nextLine();

        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        StringBuilder sb=new StringBuilder();

        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            String v=""+entry.getValue();
            String k=""+entry.getKey();

            sb.append(k);
            sb.append(v);
        }
        System.out.println(sb);
    }
}
