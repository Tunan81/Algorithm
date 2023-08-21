package pers.tunan.cq.circulate;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/17
 */
public class P12029 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                int temp = i;
                while (temp != 0) {
                    if (temp % 10 == 2) {
                        count++;
                    }
                    temp = temp / 10;
                }
            }
            System.out.println(count);
        }
    }
}
