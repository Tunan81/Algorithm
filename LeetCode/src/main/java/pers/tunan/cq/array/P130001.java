package pers.tunan.cq.array;


import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/29
 */
public class P130001 {
    static class Main {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int sum = 0;
            // 2、9、17、24、32、39、47、54、62、…前N到M项的和是多少（包括N和M）？
            int[] ints = new int[100];
            for (int i = 1; i < 100; i++) {
                ints[i] = i * (i + 1) / 2;
            }
            for (int i = n; i <= m; i++) {
                sum += ints[i];
            }
            System.out.println(sum);
        }
    }
}
