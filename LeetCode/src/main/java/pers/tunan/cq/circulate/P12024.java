package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P12024 {
    static class Main{
        public static void main(String[] args){
            for (int i = 0; i <= 9; i++) {
                for (int i1 = 0; i1 <= 9; i1++) {
                    for (int i2 = 0; i2 <= 9; i2++) {
                        if ((12300000 + i * 10000 + i1 * 1000 + 450 + i2) % 792 == 0){
                            System.out.println(i + " " + i1 + " " + i2);
                        }
                    }
                }
            }
        }
    }
}
