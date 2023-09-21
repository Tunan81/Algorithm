package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class P11006 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            if (x < 7) {
                System.out.println("2");
            } else {
                sum1 = x * 3 * 8 / 10; // 大洋商场
                sum2 = (x / 7) * 6 * 3 + (x % 7) * 3; // 百汇商厦
                if (sum1 < sum2) {
                    System.out.println("1");
                } else if (sum1 > sum2) {
                    System.out.println("2");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
