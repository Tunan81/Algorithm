package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12017 {
    static class Main{
        public static boolean isSquare(int num) {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        }

        public static int findTriangularSquare() {
            int n = 1;
            while (true) {
                int triangularNumber = n * (n + 1) / 2;
                if (triangularNumber > 9999) {
                    break;
                }

                if (isSquare(triangularNumber)) {
                    return triangularNumber;
                }

                n++;
            }

            return -1;
        }

        public static void main(String[] args) {
            int result = findTriangularSquare();
            System.out.println(result);
        }
    }
}
