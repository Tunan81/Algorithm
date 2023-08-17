package pers.tunan.weyoung.circulate;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/17
 */
public class P12015 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int count = 0;
            for (int i = 100; i <=1000; i++) {
                int sum = i + a;
                if (sum >= 1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
