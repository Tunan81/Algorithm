package pers.tunan.cqie;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P12010 {
    public static class Main {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if ((i % 3 == 0 || i % 5 == 0) && i % 7 != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
