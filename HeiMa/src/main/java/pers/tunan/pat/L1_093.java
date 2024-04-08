package pers.tunan.pat;

import java.util.Scanner;

public class L1_093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[][] baobao = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                baobao[i][i1] = scanner.nextInt();
            }
        }
        for (int i = 0; i < k; i++) {
            int count = 0;
            int flag = 0;
            for (int i1 = 0; i1 < n; i1++) {
                if (baobao[i][i1] != color[i1] && baobao[i][i1] != 0){
                    flag++;
                }
                if (baobao[i][i1] == 0){
                    count ++;
                }
            }
            if (count == n || flag!= 0){
                System.out.println("Ai Ya");
            } else {
                System.out.println("Da Jiang!!!");
            }
        }
    }
}
