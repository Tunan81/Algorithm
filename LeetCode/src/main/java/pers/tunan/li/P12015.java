package pers.tunan.li;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/12
 */
public class P12015 {
    static class Main{
        // todo 未完成
        public static void main(String[] args){
            //在1*2 *3*…* 100 的积中，从右边数有多少个0，和第 25 个数字是多少？
            // 使用循环结构
            int sum = 1;
            for (int i = 1; i <= 100; i++){
                sum *= i;
            }
            System.out.println(sum);
            int count = 0;
            while (sum % 10 == 0){
                count++;
                sum /= 10;
            }
            System.out.println(count);
        }
    }
}
