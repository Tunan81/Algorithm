package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12012 {
    static class Main{
        public static void main(String[] args) {
            for (int i = 1; i < 1000; i++){
                if (i % 4 == 3 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
