import java.util.Scanner;

public class vowelLength {
  public static boolean isVowel(String s)
  {
      if(s==null || s.isEmpty())
      {
          return false;
      }
      char ch=Character.toLowerCase(s.charAt(0));
      return ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u';
  }
   public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Sentence");
       String s=sc.nextLine().trim();

       for(char ch:s.toCharArray())
       {
           if(!(Character.isLetter(ch) || Character.isWhitespace(ch)))
           {
               System.out.println(s+" is an Invalid Sentence");
               return;
           }
       }

       String w[]=s.split("\\s+");
       boolean trueVowel=false;
       String result="";
       for(int i=0;i<w.length;i++)
       {
           String word=w[i];
           if(isVowel(word))
           {
               trueVowel=true;
               result+=word.length();
           }
           else {
               result+=word;
           }
           if(i<w.length-1) result+=" ";
       }
       if(!trueVowel)
       {
           System.out.println("No vowel Found..");
           return;
       }
       else {
           System.out.println("The converted Sentence: "+result);
       }
   }

}
