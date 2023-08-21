package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/18
 */
public class P10021 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int dominoCount = (n * m) / 2;
            System.out.println(dominoCount);
        }
    }
}
