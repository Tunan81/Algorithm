package pers.tunan.li;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/8
 */
public class Ming {

    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            int sum = 0;
            int term = 0;
            int mod = 7;

            for (int i = 0; i < n; i++) {
                term = (term * 10 + 1) % mod;
                sum = (sum + term) % mod;
            }

            System.out.println(sum);
        }
    }
}
