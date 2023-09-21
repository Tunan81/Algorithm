package pers.tunan;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class P10013 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a > c){
                int temp = a;
                a = c;
                c = temp;
                temp = b;
                b = d;
                d = temp;
            }
            int x = (c * b - a * d) / (d - b);
            System.out.println(x);
        }
    }
}
