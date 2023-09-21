package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P12019 {
    static class Main {
        public static void main(String[] args) {
            for (int i = 0; i <= 9; i++) {
                for (int i1 = 0; i1 <= 9; i1++) {
                    for (int i2 = 0; i2 <= 9; i2++) {
                        int x = 947000 + i * 100 + i1 * 10 + i2;
                        if (x % 2 == 0 && x % 3 == 0 && x % 5 == 0 && i != i1 && i1 != i2 && i != i2) {
                            System.out.println(x);
                            return;
                        }
                    }
                }
            }
        }
    }
}

