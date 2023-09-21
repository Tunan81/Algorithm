package pers.tunan.cq.array;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/6
 */
public class P13005 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 1; i <= n; i++){
                if (i / 3 == 1) {
                    // 将数组中所有数初始化为0
                    Arrays.stream(arr).forEach(a -> a = 0);
                } else if (i / 3 == 2) {
                    // 将数组中所有编号为2的倍数的数相反处理 0 -> 1, 1 -> 0
                    for (int j = 0; j < n; j++){
                        if ((j + 1) % 2 == 0) {
                            arr[j] = arr[j] == 0 ? 1 : 0;
                        }
                    }
                } else {
                    // 将数组中所有编号为2的倍数的数相反处理 0 -> 1, 1 -> 0
                    for (int j = 0; j < n; j++){
                        if ((j + 1) % 3 == 0) {
                            arr[j] = arr[j] == 0 ? 1 : 0;
                        }
                    }
                }
            }
            // 输出数组中1的个数
            System.out.println(Arrays.stream(arr).filter(a -> a == 1).count());
        }
    }
}
