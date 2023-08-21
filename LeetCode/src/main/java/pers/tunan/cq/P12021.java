package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P12021 {
    static class Main {
        // 1 3 6 10 15 21 28 36 45 55
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt(); // 输入n

            int sum = 0;
            int currentValue = 1;

            // 循环计算前n项和
            for (int i = 1; i <= n; i++) {
                sum += currentValue;
                currentValue += i;
            }

            // 输出结果
            System.out.println(sum);

            scanner.close();
        }
    }
}
