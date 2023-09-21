package pers.tunan.cq.function;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
public class P14001 {
    static class Main {
        /*        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
                    int m = scanner.nextInt();
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        int sum = 0;
                        int temp = i;
                        while (temp != 0){
                            sum += i % 10;
                            temp /= 10;
                        }
                        if (sum == m){
                            count++;
                        }
                    }
                    System.out.println(count);
                }*/
        public static int findNumber(int n, int m) {
            int count = 0;
            for (int num = 1; num <= n; num++) {
                int digitSum = 0;
                int temp = num;
                while (temp > 0) {
                    digitSum += temp % 10;
                    temp /= 10;
                }
                if (digitSum == m) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int result = findNumber(n, m);
            System.out.println(result);
        }
    }
}
