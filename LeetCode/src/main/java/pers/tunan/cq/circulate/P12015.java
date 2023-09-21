package pers.tunan.cq.circulate;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/17
 */
public class P12015 {
    static class Main{
        public static void main(String[] args){
            int count = 0;
            int num = 0;
            // 在1*2 *3*…* 100 的积中
            // 从右边数有多少个0
            // 第 25 个数字是多少？
            for (int i = 1; i <= 100; i++){
                int temp = i;
                while (temp % 5 == 0){
                    count++;
                    temp /= 5;
                }
                num += count;
            }
            System.out.println(num);
        }
    }
}
