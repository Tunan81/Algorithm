package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P10010 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int cxk = 0;
            int rabbit = 0;
            for (int i = 0; i <= n; i++) {
                cxk = i;
                rabbit = n - i;
                if (cxk * 2 + rabbit * 4 == m){
                    System.out.println(cxk + " " + rabbit);
                    break;
                }
            }
        }
    }
}
