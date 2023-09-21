package pers.tunan.cqie;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P12020 {
    static class Main {
        public static void main(String[] args) {
            for (int i = 400; i < 500; i++) {
                if (i % 3 == 2 && i % 5 == 4 && i % 7 == 5) {
                    System.out.println(i);
                }
            }
        }
    }
}
