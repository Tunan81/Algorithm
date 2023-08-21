package pers.tunan.cq;

import java.io.*;
import java.util.Arrays;

public class B_0428_6 {

    static class Main {
        private static final int INSERTION_THRESHOLD = 10;

        public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j <= right) {
                temp[k++] = arr[j++];
            }

            System.arraycopy(temp, 0, arr, left, k);
        }

        public static void insertionSort(int[] arr, int left, int right) {
            for (int i = left + 1; i <= right; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= left && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                if (right - left + 1 <= INSERTION_THRESHOLD) {
                    insertionSort(arr, left, right);
                } else {
                    int mid = left + (right - left) / 2;
                    Arrays.parallelPrefix(arr, left, mid + 1, Math::min);
                    Arrays.parallelPrefix(arr, mid + 1, right + 1, Math::max);
                    merge(arr, left, mid, right, new int[right - left + 1]);
                }
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            mergeSort(arr, 0, n - 1);
            for (int i = 0; i < n; i++) {
                PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
                out.print(arr[i]);
                if (i < n - 1) {
                    out.print("\n");
                }
                out.flush();
            }
        }
    }
}
