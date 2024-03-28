package pers.tunan.pat;

import java.util.Scanner;

public class L1_084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i < a + b; i++) {
            sum *= i;
        }
    }
}
