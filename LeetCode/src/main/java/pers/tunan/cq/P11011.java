package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/25
 */
public class P11011 {
    static class Main{
        public static void main(String[] args) {
            int n = 10;
            int[] permutation = new int[n];
            for (int i = 0; i < n; i++) {
                permutation[i] = i + 1;
            }
            for (int row = 2; row <= n; row++) {
                int mid = row / 2;
                int offset = row % 2 == 0 ? -1 : 1;

                for (int i = 0; i < mid; i++) {
                    permutation[i] = offset * (permutation[i] + permutation[i + mid]);
                }
            }
            System.out.println(permutation[0]);
        }
    }
}
