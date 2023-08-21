package pers.tunan.cq.order;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/20
 */
public class P12034 {
    static class Main{
        public static void main(String[] args) {
            int n = 1; // 输入的倍数
            int number = findNumber(n);
            System.out.println("满足条件的最小数是: " + number);
        }

        public static int findNumber(int n) {
            int originalNumber = 7; // 原始数，个位数为7
            int newNumber = Integer.parseInt("7" + originalNumber); // 将个位数7放到首位
            int multiplier = 1; // 倍数从1开始逐步增加

            while (newNumber % originalNumber != 0 || newNumber / originalNumber != n) {
                // 如果新数不能被原数整除或者新数不是原数的n倍，继续增加倍数和计算新数
                multiplier++;
                newNumber = Integer.parseInt("7" + originalNumber * multiplier);
            }

            return newNumber;
        }
    }
}
