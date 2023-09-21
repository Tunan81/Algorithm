package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/6
 */
public class T10000 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr1 = new int[n][p];
            int[][] arr2 = new int[p][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < p; j++){
                    arr1[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < p; i++){
                for (int j = 0; j < m; j++){
                    arr2[i][j] = scanner.nextInt();
                }
            }
            int[][] result = new int[n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    for (int k = 0; k < p; k++){
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if (result[i][j] < 0) {
                        System.out.print(result[i][j] + 1000000007 + " ");
                    } else {
                        System.out.print(result[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
