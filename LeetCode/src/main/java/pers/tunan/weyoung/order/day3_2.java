package pers.tunan.weyoung.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class day3_2 {
    static  class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            // b为计算次数
            for (int i = 0; i < b; i++) {
                if (a % 10 == 0) {
                    a = a / 10;
                } else {
                    a = a -1;
                }
            }
            System.out.println(a);
        }
    }
}
