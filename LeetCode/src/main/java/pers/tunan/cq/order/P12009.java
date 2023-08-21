package pers.tunan.cq.order;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12009 {
    static class Main{
        public static void main(String[] args){
            for (int i = 0; i <= 99; i++) {
                int num = 200008 + i * 100;
                if (num % 99 == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
