package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/5
 */
public class P13020 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            String s = scanner.next();
            String[] array = s.split("");
            int[] count = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count[i]++;
                    } else {
                        break;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] >= k) {
                    max = i;
                    break;
                }
            }
            if (max != 0) {
                System.out.println(array[max]);
            } else {
                System.out.println(0);
            }
        }
    }
}
