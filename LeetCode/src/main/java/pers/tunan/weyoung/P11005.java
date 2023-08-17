package pers.tunan.weyoung;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P11005 {
    static class Main {
        public static void main(String[] args) {
            boolean flag = true;
            while (flag) {
                int sum = 0;
                for (int i = 1; i <= 500; i++) {
                    if (i % 3 == 2 && i % 5 == 4 && i % 7 == 5) {
                        sum = i;
                        flag = false;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
