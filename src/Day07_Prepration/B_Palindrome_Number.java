package Day07_Prepration;

import java.util.Scanner;

public class B_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while (n>0){
            int digit = n%10;
            rev = rev * 10 +digit;
            n = n/10;
        }
        System.out.println(rev);
        if(original == rev){
            System.out.println("The Number is Palindrome ");
        }else{
            System.out.println("The Number is not a Palindrome ");
        }
    }
}
