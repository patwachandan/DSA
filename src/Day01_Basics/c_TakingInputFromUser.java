package Day01_Basics;

import java.util.Scanner;

public class c_TakingInputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of X");
//
//        int x= sc.nextInt();
//        System.out.println(x);
        System.out.println("Enter the Rate: ");
        double r = sc.nextInt();
        System.out.println("Enter the Principle Amount: ");
        double p = sc.nextInt();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        double Simple_Interest = p*r*t/100;
        System.out.println("The Simple Interest is: " +Simple_Interest);
        double amount = p+Simple_Interest;
        System.out.println("Total Amount is Principle amount + Simple Interest: "+amount);
    }
}
