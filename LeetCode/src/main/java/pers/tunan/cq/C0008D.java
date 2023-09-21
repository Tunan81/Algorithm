package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/11
 */
public class C0008D {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++){
                if (isPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
        }

        public static boolean isPrime(int n){
            if (n == 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
