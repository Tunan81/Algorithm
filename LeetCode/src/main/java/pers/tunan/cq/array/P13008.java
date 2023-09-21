package pers.tunan.cq.array;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/4
 */
public class P13008 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            BigInteger base = new BigInteger("2");
            BigInteger result = base.pow(n);
            System.out.println(result);
        }
    }
}
