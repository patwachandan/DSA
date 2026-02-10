package Day05_Methods;

import java.util.Scanner;

public class E_CombinationUsingFunction {
    public static void fact(int x){
        int xfact = 1;
        for (int i = 1; i <= x ; i++) {
            xfact*=i;
        }
//        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = sc.nextInt();
        int rfact = sc.nextInt();
        int n_rfact = sc.nextInt();
        int ncr = nfact/(rfact*n_rfact);
        System.out.println(ncr);
    }
}
