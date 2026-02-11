package Day06_Array;

import java.util.Scanner;

public class C_SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Array Input

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();



        }
        int sum =0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];

        }

        System.out.println("Array: ");
        System.out.println("Sum: "+sum);
    }
}
