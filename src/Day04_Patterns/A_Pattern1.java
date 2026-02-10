package Day04_Patterns;

import java.util.Scanner;

public class A_Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row number:");
        int r = sc.nextInt();
        System.out.println("Enter Column number: ");
        int c = sc.nextInt();
        for (int i = 1 ; i <= r ; i++){
            for (int j = 1; j <= c ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
