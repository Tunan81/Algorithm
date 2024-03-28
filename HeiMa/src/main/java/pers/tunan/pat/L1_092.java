package pers.tunan.pat;

import java.util.Scanner;

public class L1_092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[n][3];
        for (int i = 0; i < n; i++) {
            ints[i][0] = scanner.nextInt();
            ints[i][1] = scanner.nextInt();
            ints[i][2] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (ints[i][0] + ints[i][1] == ints[i][2]){
                System.out.println("Tu Dou");
            } else if (ints[i][0] * ints[i][1] == ints[i][2]){
                System.out.println("Lv Yan");
            } else {
                System.out.println("zhe du shi sha ya!");
            }
        }
    }
}
