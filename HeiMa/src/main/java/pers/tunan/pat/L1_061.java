package pers.tunan.pat;

import java.util.Scanner;

public class L1_061 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        double w  = scanner.nextFloat();
        double h  = scanner.nextFloat();
        double sum =w / Math.pow(h,2);
        System.out.println(String.format("%.1f",sum));
        if (sum > 25){
            System.out.println("PANG");
        } else {
            System.out.println("Hai Xing");
        }
    }
}
