package pers.tunan.weyoung;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/14
 */
public class P {
    static class main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            scanner.close();
            int x = 0;
            if (c > a){
                x = (b * c - a * d) / (c - a);
            } else {
                x = (b * c - a * d) / (a - c);
            }
            System.out.println(x);
        }
    }
}
