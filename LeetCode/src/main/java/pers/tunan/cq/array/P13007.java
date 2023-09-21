package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/4
 */
public class P13007 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // 总页码
            int m = scanner.nextInt(); // 数字m
            scanner.close();

            int count = countOccurrences(n, m);

            System.out.println(count);
        }

        public static int countOccurrences(int n, int m) {
            int count = 0;

            for (int i = 1; i <= n; i++) {
                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit == m) {
                        count++;
                    }
                    num /= 10;
                }
            }

            return count;
        }
    }
}
