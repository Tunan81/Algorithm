package pers.tunan.cq.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/29
 */
public class P13002 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.print(countOccurrences(n));
        }
        public static int countOccurrences(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    list.add(digit);
                    num /= 10;
                }
            }
            return list.stream().mapToInt(Integer::intValue).sum();
        }
    }
}
