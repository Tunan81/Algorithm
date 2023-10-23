package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P11013 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt(); // 重量（克）
            int n = scanner.nextInt(); // 是否加急
            int sum = 0;
            if (m <= 1000){
                sum = 8;
            } else {
                sum = 8 + (m - 1000) / 500 * 4;
                if ((m - 1000) % 500 != 0){
                    sum += 4;
                }
            }
            if (n == 1){
                sum += 5;
            }
            System.out.println(sum);
        }
    }
}
