package pers.tunan.pat;

import java.util.Scanner;

public class L1_042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 100 - x;
        int b = 100 - y;
        int sum = (int) (100 * 100 * 0.5 - (x * y * 0.5)- (a * y) - (a * b * 0.5));
        System.out.println(sum);
    }
}
