package pers.tunan.weyoung.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10002 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (c == 0) {
                System.out.println(" ");
            } else {
                System.out.println((a + b) / c);
            }
        }
    }
}
