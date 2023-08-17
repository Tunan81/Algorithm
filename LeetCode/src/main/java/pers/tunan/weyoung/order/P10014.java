package pers.tunan.weyoung.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10014 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int sum = (2 * (n + m) - k) / 4;
            System.out.println(sum);
        }
    }
}
