package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/6
 */
public class P13015 {
    static class Main{
        // todo 运行时错误
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }
            int sumLength = n * (n + 1) / 2;
            long[] sum = new long[sumLength];
            int index = 0;
            for (int i = 0; i < n; i++){
                long temp = 0;
                for (int j = i; j < n; j++){
                    temp += arr[j];
                    sum[index++] = temp;
                }
            }
            int count = 0;
            for (long l : sum) {
                if (l >= k) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
