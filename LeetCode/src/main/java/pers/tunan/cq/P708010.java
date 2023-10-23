package pers.tunan.cq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/11
 */
public class P708010 {
    static class Main {
        /**
         * 把一个包含m个正整数的序列划分成k个（1≤k≤m≤500）非空的连续子序列，使得每个正整数恰好属于一个序列。设第i个序列的各数之和为S(i)，
         * 你的任务是让所有S(i)的最大值尽量小。例如，序列1 2 3 2 5 4划分成3个序列的最优方案为1 2 3 | 2 5 | 4，
         * 其中S(1)、S(2)、S(3)分别为6、7、4，最大值为7；如果划分成1 2 | 3 2 | 5 4，则最大值为9，不如刚才的好。每个
         * 整数不超过10^7。如果有多解，S(1)应尽量小。如果仍然有多解，S(2)应尽量小，依此类推。
         */
        static int minMaxPagesAssignment(int[] books, int k) {
            int low = Arrays.stream(books).max().getAsInt();
            int high = Arrays.stream(books).sum();

            while (low < high) {
                int mid = (low + high) / 2;
                int scribersNeeded = 1;
                int currentSum = 0;

                for (int pages : books) {
                    if (currentSum + pages > mid) {
                        scribersNeeded++;
                        currentSum = 0;
                    }
                    currentSum += pages;
                }

                if (scribersNeeded <= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            return low;
        }

        static String[] optimalAssignment(int[][] cases) {
            String[] results = new String[cases.length];

            for (int i = 0; i < cases.length; i++) {
                int m = cases[i][0];
                int k = cases[i][1];
                int[] books = new int[]{cases[i][2]};
                int maxPageCount = minMaxPagesAssignment(books, k);
                StringBuilder assignment = new StringBuilder();
                int scribersNeeded = 1;
                int currentSum = 0;

                for (int j = books.length - 1; j >= 0; j--) {
                    if (scribersNeeded < k && currentSum + books[j] <= maxPageCount) {
                        currentSum += books[j];
                    } else {
                        assignment.insert(0, "/");
                        scribersNeeded++;
                        currentSum = books[j];
                    }
                    assignment.insert(0, books[j]);
                }

                while (scribersNeeded < k) {
                    assignment.insert(0, "/");
                    scribersNeeded++;
                }

                results[i] = assignment.toString();
            }

            return results;
        }

        public static void main(String[] args) {
            int[][] cases = {

            };

            String[] results = optimalAssignment(cases);

            for (String result : results) {
                System.out.println(result);
            }
        }
    }
}
