package pers.tunan;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class P13017 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int p = 1;
            int q = 2;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (double) q / p;
                int temp = q;
                q = q + p;
                p = temp;
            }
            System.out.printf("%.4f%n", sum);
        }
    }
}
