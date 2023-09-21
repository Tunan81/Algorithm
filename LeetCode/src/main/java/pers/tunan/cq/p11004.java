package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/11
 */
public class p11004 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            double avg = (A + B + C) / 3.0;

            int ans;
            if (avg == (int) avg) {
                ans = 0;
            } else {
                ans = 1;
            }

            System.out.println(ans);
        }
    }
}
