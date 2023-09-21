package pers.tunan.test;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12005 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 7 == 0 || pd(i,7)){
                    count ++;
                }
            }
            System.out.println(count);
        }
        public static boolean pd(int number,int d){
            String numStr = String.valueOf(number);
            return numStr.contains(String.valueOf(d));
        }
    }
}
