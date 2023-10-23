package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/5
 */
public class FC202104 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
