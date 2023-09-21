package pers.tunan.cq;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/11
 */
public class P702106 {
    static class Main {
        public static void main(String[] args) {
            int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            permutation(digits, 0);
        }

        private static void permutation(int[] arr, int index) {
            if (index == arr.length - 1) {
                checkSolution(arr);
            } else {
                for (int i = index; i < arr.length; i++) {
                    swap(arr, index, i);
                    permutation(arr, index + 1);
                    swap(arr, index, i);
                }
            }
        }

        private static void checkSolution(int[] arr) {
            int abc = arr[0] * 100 + arr[1] * 10 + arr[2];
            int def = arr[3] * 100 + arr[4] * 10 + arr[5];
            int ghi = arr[6] * 100 + arr[7] * 10 + arr[8];

            if (abc * 2 == def && abc * 3 == ghi) {
                System.out.println(abc + " " + def + " " + ghi);
            }
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
