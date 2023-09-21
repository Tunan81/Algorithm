package pers.tunan.cq.function;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/9
 */
public class p14002 {
    static class Main{
        public static void main(String[] args){
            for (int i = 0; i < 100; i++) {
                for (int i1 = 0; i1 < 100; i1++) {
                    for (int i2 = 0; i2 < 100; i2++) {
                        if (isPrime(i) && isPrime(i1) && isPrime(i2) && (Math.pow(i, 2) + Math.pow(i1, 2) + Math.pow(i2, 2)) ==  9438 && (i != i1 && i1 != i2 && i != i2)) {
                            System.out.println(i + " " + i1 + " " + i2);
                            return;
                        }
                    }
                }
            }
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
