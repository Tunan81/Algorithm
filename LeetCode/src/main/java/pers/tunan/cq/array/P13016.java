package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/6
 */
public class P13016 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.nextInt();
            }
            int[] newArr = new int[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < index; j++) {
                    if (arr[i] == newArr[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    newArr[index++] = arr[i];
                }
            }
            int count = 0;
            for (int i = 0; i < index; i++) {
                if (newArr[i] != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
