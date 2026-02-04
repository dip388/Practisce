package InterimCodes;

import java.util.Scanner;

public class FibonaaciSeries {

    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,sum=0;
        System.out.println("How many series You want to Print: ");
        int n=sc.nextInt();

        System.out.print(n1+" "+n2);
        for(int i=0;i<n;i++)
        {
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
