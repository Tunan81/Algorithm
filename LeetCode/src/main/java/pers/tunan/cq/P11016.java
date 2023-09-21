package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/10
 */
public class P11016 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = 0;
            if (m >= n){
                sum = 2 * m;
            } else {
                sum = 2 * m + n - m;
            }
            System.out.println(sum);
        }
    }
}
