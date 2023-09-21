package pers.tunan.cq.circulate;


/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
public class P12002 {
    static class Main{
        public static void main(String[] args){
            for (int i = 1; i < 20; i++) {
                for (int i1 = 1; i1 < 20; i1++) {
                    for (int i2 = 1; i2 < 20; i2++) {
                        if (isPrime(i) && isPrime(i1) && isPrime(i2) && (i * i1 * i2)==17*(i+i1+i2) && (i != i1 && i1 != i2 && i != i2)) {
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
