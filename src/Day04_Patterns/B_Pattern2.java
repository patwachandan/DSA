package Day04_Patterns;

import java.util.Scanner;

public class B_Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern Printing!...");
        System.out.println("Enter Row : ");
        int r = sc.nextInt();
        System.out.println("Enter Column : ");
        int c = sc.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r ; j++) {
//                System.out.print(i);
                System.out.print(j);
            }
            System.out.println("");

        }
    }
}
