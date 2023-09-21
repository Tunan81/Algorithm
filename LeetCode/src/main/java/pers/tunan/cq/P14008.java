package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/11
 */
public class P14008 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(gys(m, n));
        }

        public static int gys(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gys(b, a % b);
        }
    }
}
