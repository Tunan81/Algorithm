package pers.tunan.pat;

import java.util.Scanner;

public class L1_040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        double[] doubles = new double[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
            doubles[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (strings[i].equals("M")){
                System.out.println(String.format("%.2f",doubles[i] / 1.09));
            } else {
                System.out.println(String.format("%.2f",doubles[i] * 1.09));
            }
        }
    }
}
