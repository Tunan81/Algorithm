package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/18
 */
public class P10024 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int j = scanner.nextInt(); // 斤数
            int l = scanner.nextInt(); // 两数
            int total = j * 10 + l;
            int j1 = total / 16;
            int l1 = total % 16;
            System.out.println(j1 + " " + l1);
        }
    }
}
