package pers.tunan.cq.order;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12011 {
    static class Main{
        public static void main(String[] args){
            int n = 9;
            int m = 13;
            for (int i = 0; i < 29; i++) {
                n = n + m;
                m += 4;
            }
            System.out.println(n);
        }
    }
}
