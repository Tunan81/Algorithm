package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class P702103 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
