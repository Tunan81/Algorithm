package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/3
 */
public class P22017 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= arr[i - 1]) {
                        dp[i][j] += dp[i - 1][j - arr[i - 1]];
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}
