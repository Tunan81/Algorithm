package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/10
 */
public class P21004 {
    static class Main{
        /**
         * fibonacci数列是非常著名的数列:
         * F[1]= 1,
         * F[2]= 1,
         * 对于i > 3，F[i] = F[i − 1] + F[i − 2]
         * Fibonacci数列有一个特殊的性质，前一项与后一项的比值，F[i]/F[i + 1]， 会趋近于黄金分割。
         * 为了验证这一性质，给定正整数N，请你计算F[N]/F[N + 1]，并保留8位 小数。
         */
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double[] arr = new double[n + 2];
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.printf("%.8f", arr[n] / arr[n + 1]);
        }
    }
}
