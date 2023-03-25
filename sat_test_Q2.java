// 2.write a java program to copy all the elements of an array to another array.

import java.util.Scanner;
public class sat_test_Q2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements:");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        System.out.println("Enter the array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=a.nextInt();
        }
        int destiny[]=new int[n];
        for(int i=0;i<n;i++){
            destiny[i]=arr[i];
        }

        System.out.println("Duplicate of the original array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(destiny[i]+" ");
        }
    }
}
