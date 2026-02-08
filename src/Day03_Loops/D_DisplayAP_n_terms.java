package Day03_Loops;

import java.util.Scanner;

public class D_DisplayAP_n_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(n temrms): ");
        int n = sc.nextInt();
        for (int i = 1; i < (n*2) ; i=i+2) {
            System.out.println(i);

        }
    }
}
