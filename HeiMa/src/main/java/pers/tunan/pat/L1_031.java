package pers.tunan.pat;

import java.util.Scanner;

public class L1_031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float c = (float) a / b;
        if (b < 0) {
            System.out.println(a + "/" + "(" + b + ")" + "=" + String.format("%.2f", c));
        } else if (b == 0) {
            System.out.println(a + "/" + b + "=" + "Error");
        } else {
            System.out.println(a + "/" + b + "=" + String.format("%.2f", c));
        }
    }
}
