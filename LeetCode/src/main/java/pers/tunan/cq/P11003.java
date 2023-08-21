package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P11003 {
    // todo
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            boolean isLeapYear = false;
            // 判断是否是闰年
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                isLeapYear = true;
            }
            boolean isMonthEnd = false;
            // 判断是否是月末
            if (m == 2) {
                if (isLeapYear) {
                    if (d == 29) {
                        isMonthEnd = true;
                    }
                } else {
                    if (d == 28) {
                        isMonthEnd = true;
                    }
                }
            } else if (m == 1 || m == 3 || m == 5 || m == 7
                    || m == 8 || m == 10 || m == 12) {
                if (d == 31) {
                    isMonthEnd = true;
                }
            } else {
                if (d == 30) {
                    isMonthEnd = true;
                }
            }
            boolean isYearEnd = false;
            if (m == 12 && d == 31) {
                isYearEnd = true;
            }
            if (isYearEnd) {
                System.out.println((y + 1) + " " + 1 + " " + 1);
            } else if (isMonthEnd) {
                System.out.println(y + " " + (m + 1) + " " + 1);
            } else {
                System.out.println(y + " " + m + " " + (d + 1));
            }
        }
    }
}
