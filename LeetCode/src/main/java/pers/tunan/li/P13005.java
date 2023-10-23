package pers.tunan.li;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/9
 */
public class P13005 {
    static class Main{
        /**
         * 宾馆里有n个房间，从1-n编了号。第一个服务员把所有的房间门都打开了，第二个服务员把所有编号是2的倍数的房间"相反处理"，
         * 第三个服务员把所有编号是3的倍数的房间作"相反处理"…，以后每个服务员都是如此。当第n个服务员来过后，总共有多少扇门是打开的。
         * （所谓"相反处理"是：原来开着的门关上，原来关上的门打开。）
         */
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            int[] arr = new int[n]; // 0表示关，1表示开
            for (int i = 0; i < n; i++) {
                if (i == 0){
                    Arrays.fill(arr, 1);
                } else {
                    for (int j = 0; j < n; j++) {
                        if ((j + 1) % (i + 1) == 0){
                            if (arr[j] == 0){
                                arr[j] = 1;
                            } else {
                                arr[j] = 0;
                            }
                        }
                    }
                }
            }
            long count = Arrays.stream(arr).filter(i -> i == 1).count();
            System.out.println(count);
        }
    }
}
