package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/28
 */
public class P20001 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            int b = n / 6 * 4 % 7;
            int c = n % 6;
            int sum = 0;
            int[] arr = {1, 4, 6, 5, 2, 0};
            for (int i = 0; i < c; i++) {
                sum += arr[i];
            }
            System.out.println((sum + b) % 7);
        }
    }
}
