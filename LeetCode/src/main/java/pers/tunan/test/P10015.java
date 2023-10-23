package pers.tunan.test;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/17
 */
public class P10015 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int l = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.close();

            int count = 0;
            int sum = a * c + b * c;
            if (sum < l) {
                System.out.println(0);
            } else if (sum == l) {
                System.out.println(1);
            } else {
                while (sum >= l) {
                    sum -= l;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
