package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/13
 */
public class P20019 {
    static class Main{
        public static void main(String[] args){
            // 给定一个长度为 N 的数组 A = [A1, A2, · · · AN]，数组中有可能有重复出现 的整数。
            //现在小明要按以下方法将其修改为没有重复整数的数组。小明会依次修改 A2, A3, · · · , AN。
            //当修改 Ai 时，小明会检查 Ai 是否在 A1 ? Ai?1 中出现过。如果出现过，
            //则 小明会给 Ai 加上 1 ；如果新的 Ai 仍在之前出现过，小明会持续给 Ai 加 1 ，
            //直 到 Ai 没有在 A1 ~ Ai-1 中出现过。 当 AN 也经过上述修改之后，
            //显然 A 数组中就没有重复的整数了。 现在给定初始的 A 数组，请你计算出最终的 A 数组。
            //输入格式 第一行包含一个整数 N。 第二行包含 N 个整数 A1, A2, · · · AN。
            //输出格式 输出一行，包含 N 个整数，表示最终的 A 数组。
            //数据范围 1 ≤ N ≤ 100000，1 ≤ Ai ≤ 1000000。
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                b[i] = a[i];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++){
                    if (a[i] == a[j]){
                        a[i]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
