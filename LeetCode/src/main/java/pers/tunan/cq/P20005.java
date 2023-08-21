package pers.tunan.cq;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/14
 */
public class P20005 {
    /*
    小明发现了一个奇妙的数字。
    它的平方和立方正好把0~9的10个数字每个用且只用了一次
    你能猜出这个数字是多少吗？
     */
    static class Main {
        public static boolean isValidNumber(String numberStr) {
            return numberStr.length() == 10 && numberStr.chars().distinct().count() == 10;
        }

        public static int findSpecialNumber() {
            for (int num = 1; num < 10000; num++) {
                int square = num * num;
                int cube = num * num * num;
                String combinedStr = String.valueOf(square) + String.valueOf(cube);
                if (isValidNumber(combinedStr)) {
                    return num;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int specialNumber = findSpecialNumber();
            System.out.println(1);
        }
    }
}
