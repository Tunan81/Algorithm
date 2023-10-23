package pers.tunan.cq.function;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/25
 */
public class P14010 {
    static class Main{
        public static void main(String[] args) {
            List<Integer> digits = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                digits.add(i);
            }

            List<List<Integer>> permutations = new ArrayList<>();
            permute(digits, 0, permutations);

            for (List<Integer> permutation : permutations) {
                if (isDivisible(permutation)) {
                    long result = 0;
                    for (int digit : permutation) {
                        result = result * 10 + digit;
                    }
                    System.out.println("满足条件的9位数: " + result);
                    break;
                }
            }
        }

        public static void permute(List<Integer> digits, int index, List<List<Integer>> permutations) {
            if (index == digits.size()) {
                permutations.add(new ArrayList<>(digits));
            } else {
                for (int i = index; i < digits.size(); i++) {
                    swap(digits, index, i);
                    permute(digits, index + 1, permutations);
                    swap(digits, index, i);
                }
            }
        }

        public static void swap(List<Integer> list, int i, int j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        public static boolean isDivisible(List<Integer> digits) {
            for (int i = 1; i <= 9; i++) {
                int number = 0;
                for (int j = 0; j < i; j++) {
                    number = number * 10 + digits.get(j);
                }
                if (number % i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
