package pers.tunan.cq;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/14
 */
public class P36003 {
    /*
    明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到100000之间的随机整数
    （N≤10000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
    按照排好的顺序去找同学做调查。请你协助明明完成“排序”的工作,重复的数字重复显示（有多少个重复，显示多少个）。
    */
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();

            int[] randomNumbers = new int[N];
            for (int i = 0; i < N; i++) {
                randomNumbers[i] = scanner.nextInt();
            }

            TreeMap<Integer, Integer> sortedCounts = new TreeMap<>();
            for (int num : randomNumbers) {
                sortedCounts.put(num, sortedCounts.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : sortedCounts.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();
                for (int i = 0; i < count; i++) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
