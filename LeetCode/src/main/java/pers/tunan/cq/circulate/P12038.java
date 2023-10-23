package pers.tunan.cq.circulate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/25
 */
public class P12038 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int maxLength = fl(n, arr);
            System.out.println(maxLength);
        }

        public static int fl(int n, int[] arr) {
            Map<Integer, Integer> lastSeen = new HashMap<>();
            int maxLength = 0;
            int start = 0;
            for (int end = 0; end < n; end++) {
                if (lastSeen.containsKey(arr[end]) && lastSeen.get(arr[end]) >= start) {
                    start = lastSeen.get(arr[end]) + 1;
                }
                lastSeen.put(arr[end], end);
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
