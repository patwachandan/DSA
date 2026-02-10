package Day04_Patterns;

import java.util.Scanner;

public class C_Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row and Column : ");
        int m = sc.nextInt();
        for (int i =1; i <= m ; i++) {
            for (int j = 1; j <= m ; j++) {
                System.out.print((char)(j+64)+" ");    // i+64

            }
            System.out.println();

        }
    }
}
