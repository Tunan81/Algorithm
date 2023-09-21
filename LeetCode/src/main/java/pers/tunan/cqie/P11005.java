package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P11005 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int d = scanner.nextInt();
            int p = 0;
            if (d <= 4){
                p = 2 * d;
            } else {
                p = 8 + (d - 4) * 5;
            }
            System.out.println(p);
        }
    }
}
