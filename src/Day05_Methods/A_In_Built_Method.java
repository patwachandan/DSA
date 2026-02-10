package Day05_Methods;

import java.util.Scanner;

public class A_In_Built_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In Built Function");
        System.out.println("Enter Number(a): ");
        int a = sc.nextInt();
        System.out.println("Enter Number(b): ");
        int b = sc.nextInt();
        int square = 5;

        System.out.println(Math.pow(a,b));  // To calculate power of 2 numbers ( a power b )
        System.out.println(Math.sqrt(square));   // To Calculate the square value of the given number.
        System.out.println(Math.cbrt(219));  // To calculate cube root of the number
        System.out.println(Math.abs(-4));  // To convert negative values in Positive
        int x = 5,   y = 6, z = 23, p = 8;
        System.out.println(Math.max(x,Math.max(y,Math.max(z,p))));  // To Calculate maximum value


    }
}
