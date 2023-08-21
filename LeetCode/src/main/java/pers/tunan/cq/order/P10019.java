package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10019 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = a * 1000 + a;
            System.out.println(b / 7 / 11 / 13);
        }
    }
}
