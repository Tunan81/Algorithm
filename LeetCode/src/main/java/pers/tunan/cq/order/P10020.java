package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/18
 */
public class P10020 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // 边长
            int m = n * n; // 正方形面积
            int sm = 16 / 12; // 小方块面积
            int count = m / sm; // 小方块个数
            System.out.println(count);
        }
    }
}
