package pers.tunan.pat;

import java.util.Scanner;

public class L1_063 {
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
            if (ints[i][0] == 1){
                if (ints[i][1] < 130){
                    System.out.print("duo chi yu! ");
                } else if (ints[i][1] == 130){
                    System.out.print("wan mei! ");
                } else {
                    System.out.print("ni li hai! ");
                }
                if (ints[i][2] < 27){
                    System.out.print("duo chi rou!" + "\n");
                } else if (ints[i][2] == 27){
                    System.out.print("wan mei!" + "\n");
                } else {
                    System.out.print("shao chi rou!"+"\n");
                }
            }
            if (ints[i][0] == 0){
                if (ints[i][1] < 129){
                    System.out.print("duo chi yu! ");
                } else if (ints[i][1] == 129){
                    System.out.print("wan mei! ");
                } else {
                    System.out.print("ni li hai! ");
                }
                if (ints[i][2] < 25){
                    System.out.print("duo chi rou!" + "\n");
                } else if (ints[i][2] == 25){
                    System.out.print("wan mei!" + "\n");
                } else {
                    System.out.print("shao chi rou!" + "\n");
                }
            }
        }
    }
}
