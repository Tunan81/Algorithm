package pers.tunan.cqie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P23016 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] A = new int[n];
            int[] B = new int[m];
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                B[i] = scanner.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            long left = 0;
            long right = (long) A[n - 1] * B[m - 1];

            while (left < right) {
                long mid = (left + right) / 2;
                long count = 0;
                for (int i = 0; i < n; i++) {
                    count += Math.min(mid / A[i], m);
                }
                if (count < k) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left);
        }
    }
}
