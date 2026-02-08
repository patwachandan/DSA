package Day03_Loops;

import java.util.Scanner;

public class B_TableOf19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table Number which you want to print: ");
        int table = sc.nextInt();
        for (int i = table; i <= (table*10) ; i++) {
            if(i%table==0){
                System.out.println(i);
            }

        }
    }
}
