package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/6
 */
public class N1 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j]--;
                    // 判断arr中是否有0
                    boolean flag = false;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == 0){
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
    }
}
