package pers.tunan.pat;

import java.util.Scanner;

public class L1_076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int m = scanner.nextInt();
        double[] doubles = new double[n];
        for (int i = 0; i < n; i++) {
            doubles[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if(doubles[i] < m){
                System.out.println("On Sale! "+String.format("%.1f",doubles[i]));
            }
        }
    }
}
