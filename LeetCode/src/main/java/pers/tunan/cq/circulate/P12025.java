package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P12025 {
    static class Main{
        public static void main(String[] args){
            for (int i = 1500; i < 1600; i++) {
                if ((i % 7 == 1 && i % 8 == 2 && i% 9==3) && (i / 7 + i / 8 + i / 9) == 570){
                    System.out.println(i);
                }
            }
        }
    }
}
