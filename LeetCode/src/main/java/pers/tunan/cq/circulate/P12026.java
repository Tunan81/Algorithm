package pers.tunan.cq.circulate;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P12026 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                // i的各个位数之和
                int sum = 0;
                int temp = i;
                while (temp != 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (isW(i) && isW(sum)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        public static boolean isW(int n) {
            int temp = (int) Math.sqrt(n);
            return temp * temp == n;
        }
    }
}
