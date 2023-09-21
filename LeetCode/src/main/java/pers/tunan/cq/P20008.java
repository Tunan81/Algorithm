package pers.tunan.cq;

import java.text.Format;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/7
 */
public class P20008 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] count = new int[10];
            for (int i = 1; i <= n; i++) {
                int temp = i;
                while (temp != 0){
                    count[temp % 10]++;
                    temp /= 10;
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(count[i] + " ");
            }
        }
    }
}
