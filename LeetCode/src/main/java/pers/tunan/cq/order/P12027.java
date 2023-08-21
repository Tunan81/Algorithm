package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12027 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= m; i++) {
                if (!hasOtherPrimeFactors(i, 2) && !hasOtherPrimeFactors(i, 5)) {
                    count++;
                }
            }

            System.out.print(count);
        }
        public static boolean hasOtherPrimeFactors(int number, int prime) {
            while (number % prime == 0) {
                number /= prime;
            }
            return number > 1;
        }
    }
}
