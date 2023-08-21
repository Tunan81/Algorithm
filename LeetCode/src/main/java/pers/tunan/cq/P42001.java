package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P42001 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            int count = 0;
            for (int i = L; i <= R; i++) {
                count += count2(i);
            }
            System.out.println(count);
        }
        public static int count2(int num) {
            int count = 0;
            while (num != 0) {
                if (num % 10 == 2) {
                    count++;
                }
                num /= 10;
            }
            return count;
        }
    }
}
