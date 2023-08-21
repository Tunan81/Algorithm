package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12006 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            int count = 0;
            for (int i = 10001; i <= 99999; i++) {
                if (isPalindrome(i) && digitSum(i) == n) {
                    count++;
                }
            }

            for (int i = 100001; i <= 999999; i++) {
                if (isPalindrome(i) && digitSum(i) == n) {
                    count++;
                }
            }
            System.out.print(count);
        }

        public static boolean isPalindrome(int num) {
/*            String oldStr = String.valueOf(num);
            String newStr = new StringBuilder(oldStr).reverse().toString();
            return oldStr.equals(newStr);*/
            if (num < 0 ||(num > 0 && num % 10 == 0)){
                return false;
            }
            int a = 0;
            while (num > a){
                a = a * 10 + num % 10;
                num /= 10;
            }
            return num == a || num == (a / 10);
        }

        public static int digitSum(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }
}
