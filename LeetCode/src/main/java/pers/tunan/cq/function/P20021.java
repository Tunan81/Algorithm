package pers.tunan.cq.function;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/25
 */
public class P20021 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            System.out.println(findNthFourAndSevenNumber(n));
        }

        public static boolean isFourOrSeven(long n) {
            while (n > 0) {
                long digit = n % 10;
                if (digit != 4 && digit != 7) {
                    return false;
                }
                n /= 10;
            }
            return true;
        }

        public static long findNthFourAndSevenNumber(int n) {
            int count = 0;
            long currentNumber = 4;
            while (count < n) {
                if (isFourOrSeven(currentNumber)) {
                    count++;
                }
                if (count < n) {
                    currentNumber++;
                }
            }
            return currentNumber;
        }
    }
}
