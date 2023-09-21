package pers.tunan.cqie;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P12009 {
    static class Main{
        public static void main(String[] args){
            for (int i = 0; i <= 9; i++) {
                for (int i1 = 0; i1 < 9; i1++) {
                    if ((200008+i*1000+i1*100)%99==0){
                        System.out.println(i+""+i1);
                    }
                }
            }
        }
    }
}
