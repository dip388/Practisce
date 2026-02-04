package InterimCodes;

import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {

        int arr[]={10,4,6,20,50};
        //int arr1[]=new int[arr.length];
        System.out.println("Before Reverse The array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Reversing: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
//            arr1[i]=arr[i];
//            System.out.print(arr1[i]+" ");
        }

        //Remove Duplicates From Array

    }
}
