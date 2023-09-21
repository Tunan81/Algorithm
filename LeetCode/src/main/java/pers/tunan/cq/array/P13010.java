package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/4
 */
public class P13010 {
    static class Main{
        public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr =  new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
