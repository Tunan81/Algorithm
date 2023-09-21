package pers.tunan.cq.function;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/9
 */
public class P14003 {
    static class Main{
        // todo: 未完成
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 3; i < n; i++) {
                if (gcd(i, n) == 1){
                    count++;
                }
            }
            System.out.println(count);
        }

        public static int gcd(int a, int b){
            if (b == 0){
                return a;
            }
            return gcd(b, a % b);
        }
    }
}
