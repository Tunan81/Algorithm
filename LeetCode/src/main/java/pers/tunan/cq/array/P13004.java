package pers.tunan.cq.array;

import java.io.*;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/19
 */
public class P13004 {
    static class Main {
        public static void main(String[] args) throws IOException {
            Scanner reader = new Scanner(System.in);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
            int n = reader.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = reader.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int temp = 1;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        temp *= a[j];
                    }
                }
                b[i] = temp;
            }
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    out.print(b[i]);
                } else {
                    out.print(b[i] + " ");
                }
                out.flush();
            }
        }
    }
}
