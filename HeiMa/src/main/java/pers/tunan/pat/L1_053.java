package pers.tunan.pat;

import java.util.Scanner;

public class L1_053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < a + b; i++) {
            System.out.print("Wang!");
        }
    }
}
