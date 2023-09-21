package pers.tunan.cq.function;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/9
 */
public class P14006 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int max = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime(i) && isPrime(n - i)){
                    max = Math.max(max, i * (n - i));
                }
            }
            System.out.println(max);
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
