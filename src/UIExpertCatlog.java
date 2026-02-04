import java.util.Scanner;
import java.util.Set;

public class UIExpertCatlog {

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        ExpertCatlog ec=new ExpertCatlog();
        System.out.println("Enter the number of experts");
        int n=Integer.parseInt(sc.nextLine());

        System.out.println("Enter the expert details (ExpertName:Topic)");
        for(int i=0;i<n;i++)
        {
            String details=sc.nextLine().trim();
            ec.addExpert(details);

        }

        System.out.println("Enter the topic");
        String top=sc.nextLine();

        Set<String> res=ec.getExpertByTopic(top);
        if(res.isEmpty())
        {
            System.out.println("No expert were found for the topic "+top);
            return;
        }
        else {
            System.out.println("Expert Specializing in "+top);
            for(String title:res)

            {
                System.out.println(title);
            }
        }
    }
}
