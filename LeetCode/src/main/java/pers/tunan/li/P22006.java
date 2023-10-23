package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/12
 */
public class P22006 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int sum = 0;
            sum = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println(sum);
        }
        public static int factorial(int n){
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }
    }
}
