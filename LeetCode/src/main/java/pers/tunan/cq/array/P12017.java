package pers.tunan.cq.array;


/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
public class P12017 {
    static class Main{
        public static void  main(String[] args) {
            for (int i = 1000; i < 9999; i++) {
                if (isSquare(i) && isTriangle(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
        public static boolean isSquare(int n){
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        }
        public static boolean isTriangle(int n){
            int sqrt = (int) Math.sqrt(2 * n);
            return sqrt * (sqrt + 1) / 2 == n;
        }

    }
}
