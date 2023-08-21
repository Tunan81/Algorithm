package pers.tunan.cq;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/13
 */
public class P21003 {
    static class Main {
        public static void main(String[] args) {
            for (int i = 1; i <= 1000000; i++) {
                // k是两位数，k的两位数之和为r，也是完全平方数
                if (isPalinedrome(i) && isPerfectSquare(i) && isPalinedrome(sumOfDigits(i))
                        && isPerfectSquare2(sumOfDigits(i))
                ) {
                    System.out.println(i);
                }
            }
        }

        public static boolean isPalinedrome(int num) {
            String str = Integer.toString(num);
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        public static boolean isPerfectSquare(int num){
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        }

        //k是两位数，k的两位数之和为r，也是完全平方数
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
        //判断k是否为两位数而且两位数之和为完全平方数
        public static boolean isPerfectSquare2(int num) {
            if (num < 10 || num > 99) {
                return false;
            }
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return isPerfectSquare(sum);
        }
    }
}
