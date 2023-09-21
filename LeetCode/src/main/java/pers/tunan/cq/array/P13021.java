package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/5
 */
public class P13021 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int x = i * (i + 1) / 2;
                sum += x;
            }
            System.out.println(sum);
        }
    }
}
