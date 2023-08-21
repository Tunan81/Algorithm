package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10022 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int day =(b + d) / (c - a);
            int sum = a * day + b;
            System.out.println(sum + " " + day);
        }
    }
}
