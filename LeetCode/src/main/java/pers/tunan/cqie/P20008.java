package pers.tunan.cqie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P20008 {
    // TODO：这个题目的解法有问题，需要重新写
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] count = new int[10];
            for (int i = 0; i < n; i++) {
                int temp = i;
                while (temp > 0){
                    count[temp % 10]++;
                    temp /= 10;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(count[i] + " ");
            }
        }
    }
}
