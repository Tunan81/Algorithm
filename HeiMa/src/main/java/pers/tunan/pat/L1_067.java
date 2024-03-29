package pers.tunan.pat;

import java.util.Scanner;

public class L1_067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =  scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double sum;
        if (b == 0){
            sum = a * 2.455;
            System.out.print(String.format("%.2f",sum));
            if (sum > c){
                System.out.println(" T_T");
            } else {
                System.out.println(" ^_^");
            }
        } else {
            sum = a * 1.26;
            System.out.print(String.format("%.2f",sum));
            if (sum > c){
                System.out.println(" T_T");
            } else {
                System.out.println(" ^_^");
            }
        }
    }
}
