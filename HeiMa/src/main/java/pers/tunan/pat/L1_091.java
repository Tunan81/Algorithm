package pers.tunan.pat;

import java.util.Scanner;

public class L1_091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String x = scanner.next();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k == n){
            System.out.println("mei you mai " + x + " de");
        } else if (k == m) {
            System.out.println("kan dao le mai " + x + " de");
        } else {
            System.out.println("wang le zhao mai " + x + " de");
        }
    }
}
