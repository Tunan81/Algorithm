package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/15
 */
public class J10008 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int goodDays = 0;
            int badDays = n / k - goodDays;
            while (goodDays * a + badDays * b != n) {
                goodDays++;
                badDays = n / k - goodDays;
            }
            System.out.println(goodDays + " " + badDays);
        }
    }
}
