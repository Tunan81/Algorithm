package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class C2003 {
    static class Main{
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();

                int[] dp = new int[N + 1];
                dp[0] = 1;
                dp[1] = 1;

                for (int i = 2; i <= N; i++) {
                    dp[i] = dp[i - 1] + dp[i - 3];
                }

                System.out.println(dp[N]);
            }
    }
}
