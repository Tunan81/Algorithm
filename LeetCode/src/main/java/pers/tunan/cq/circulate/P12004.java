package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/8
 */
public class P12004 {
    static class Main {
        public static void main(String[] args) {
            for (int i = 0; i <= 9; i++) {
                for (int i1 = 0; i1 <= 9; i1++) {
                    for (int i2 = 0; i2 <= 9; i2++) {
                        if ((i * 100 + i * 10 + i + i1 * 100 + i1 * 10 + i1 + i2 * 100 + i2 * 10 + i2 == i2 * 1000 + i1 * 100 + i1 * 10 + i2) && (i != i1 && i1 != i2 && i != i2)) {
                            System.out.println(i + " " + i1 + " " + i2);
                        }
                    }
                }
            }
        }
    }
}
