package Day04_Patterns;

import java.util.Scanner;

public class D_Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row number: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");    //sout(i);   sout(j);

            }
            System.out.println();

        }
    }
}
