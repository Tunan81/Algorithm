package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/16
 */
import java.util.Arrays;

public class P23001 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] dp = new int[n + 1];
            dp[1] = arr[1];
            int max = dp[1];
            for (int i = 2; i <= n; i++) {
                dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }

}

