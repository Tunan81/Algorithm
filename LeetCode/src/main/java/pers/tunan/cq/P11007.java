package pers.tunan.cq;


import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/15
 */
public class P11007 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float L = scanner.nextFloat();
            float T = scanner.nextFloat();
            float sum = 0;
            float LP = 0;
            float TP = 0;
            if (L <= 2) {
                LP = 6;
            } else if (L > 2 && L <= 10) {
                LP = 6 + (L - 2) * 1.8f;
            } else {
                LP = 6 + 8 * 1.8f + (L - 10) * 2.7f;
            }
            // 每3分钟加收1元,不足3分钟，不计费。
            if (T < 3) {
                TP = 0;
            } else {
                TP = (int) (T / 3);
            }
            sum = LP + TP;
            if (sum % 1 == 0) {
                System.out.println((int) sum);
            } else {
                System.out.printf("%.1f%n", sum);
            }
        }
    }
}
