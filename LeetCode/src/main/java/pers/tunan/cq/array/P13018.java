package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/9
 */
public class P13018 {
    static class Main {
        /**
         * N个人排成一条直线（一排），给出队伍中每个人的身高。
         * 每个人只能看到站在他右边且个头比他小没有被其他人挡住的人。
         * 请求出所有人可以看到的人数之和。
         */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n ; j++) {
                    if (arr[i] >= arr[j]) {
                        sum++;
                    } else {
                        break;
                    }
                }
            }
            System.out.print(sum);
        }
    }
}
