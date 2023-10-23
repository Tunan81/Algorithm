package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/5
 */
public class J0008 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int x = scanner.nextInt();
            String result = convertToBase(a, x);
            System.out.println(result);
        }

        public static String convertToBase(int num, int base) {
            StringBuilder result = new StringBuilder();

            while (num > 0) {
                int remainder = num % base;
                if (remainder < 10) {
                    result.insert(0, remainder);
                } else {
                    char digit = (char) ('A' + remainder - 10);
                    result.insert(0, digit);
                }
                num /= base;
            }

            return result.toString();
        }
    }
}
