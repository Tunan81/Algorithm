package pers.tunan.weyoung.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10026 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            double c = a * 1.2 * 0.8 * b;
            double d = a * 0.5 * 0.1 * b;
            double e = a * 0.3 * 0.1 * b;
            double sum = a * b;
            double f = c + d + e;
            double li =0;
            if (sum >= f){
                li = sum - f;
            } else {
                li = f - sum;
            }
            System.out.println((int)li);
        }
    }
}
