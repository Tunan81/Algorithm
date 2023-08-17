package pers.tunan.weyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class day3_1 {
    static class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] split = line.split("\\+");
            int[] nums = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums[i] = Integer.parseInt(split[i]);
            }
            quickSort(nums, 0, nums.length - 1);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i != nums.length - 1) {
                    System.out.print("+");
                }
            }
        }
        public static void quickSort(int[] nums, int left, int right) {
            if (left < right) {
                int partitionIndex = partition(nums, left, right);
                quickSort(nums, left, partitionIndex - 1);
                quickSort(nums, partitionIndex + 1, right);
            }
        }
        public static int partition(int[] nums, int left, int right) {
            int pivot = left;
            int index = pivot + 1;
            for (int i = index; i <= right; i++) {
                if (nums[i] < nums[pivot]) {
                    swap(nums, i, index);
                    index++;
                }
            }
            swap(nums, pivot, index - 1);
            return index - 1;
        }
        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
