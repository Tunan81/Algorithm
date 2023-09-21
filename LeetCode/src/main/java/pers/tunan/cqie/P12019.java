package pers.tunan.cqie;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P12019 {
    static class Main{
        public static void main(String[] args){
            for (int i = 0; i <= 9; i++) {
                for (int i1 = 0; i1 <= 9; i1++) {
                    for (int i2 = 0; i2 <= 9; i2++) {
                        if ((i!= i1) && (i1 != i2) && (i != i2) && ((947000 +i*100+i1*10+i2)%2==0)&& ((947000 +i*100+i1*10+i2)%3==0)&& ((947000 +i*100+i1*10+i2)%5==0)){
                            System.out.println(947000 +i*100+i1*10+i2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
