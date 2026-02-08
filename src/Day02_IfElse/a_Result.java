package Day02_IfElse;

import java.util.Scanner;

public class a_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Physics Marks: ");
        int phy = sc.nextInt();
        System.out.println("Enter the Chemistry Marks: ");
        int chem = sc.nextInt();
        System.out.println("Enter the Mathematics Marks: ");
        int math = sc.nextInt();
        System.out.println("Enter the Hindi Marks: ");
        int hin = sc.nextInt();
        System.out.println("Enter the English Marks: ");
        int eng = sc.nextInt();
        int total = phy + chem + math + hin + eng;
        System.out.println("Total Marks is: " +total);
        double avg = total/5;
        System.out.println("Percentage : "+avg);
        if(avg>=90){
            System.out.println("Excillent");

        } else if (avg>=60 && avg<90) {
            System.out.println("Good!");

        } else if (avg>=40 && avg<60) {
            System.out.println("Pass!");

        }
        else {
            System.out.println("Fail");
        }
    }
}
