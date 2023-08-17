package pers.tunan.weyoung;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P702005 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] strings = input.split(" ");
            int[] nums = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                nums[i] = Integer.parseInt(strings[i]);
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
                sum += num;
            }
            double avg = (double) sum / nums.length;
            System.out.println(min + " " + max + " " + String.format("%.3f", avg));
        }
    }
}
