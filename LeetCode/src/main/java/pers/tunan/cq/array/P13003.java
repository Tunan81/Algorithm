package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/29
 */
public class P13003 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    array[i] = 1;
                } else if (i == 1) {
                    array[i] = n;
                } else {
                    if (array[i - 1] > array[i - 2]) {
                        array[i] = array[i - 1] - array[i - 2];
                    } else {
                        array[i] = array[i - 2] - array[i - 1];
                    }
                }
            }
            System.out.println(array[n - 1]);
        }
    }
}
