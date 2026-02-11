package Day06_Array;

import java.util.Scanner;

public class B_TakingInpur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //Array Input

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        // Array Outpur

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

        }

    }
}
