package pers.tunan.pat;

import java.util.Scanner;

public class L1_047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        int[] m = new int[n];
        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
            m[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (m[i] < 15 || m[i] > 20 || k[i] < 50 || k[i] > 70) {
                System.out.println(strings[i]);
            }
        }
    }
}
