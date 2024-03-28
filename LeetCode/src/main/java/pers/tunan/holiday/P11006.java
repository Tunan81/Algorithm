package pers.tunan.holiday;


import java.util.Scanner;

public class P11006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 7) {
            System.out.print("2");
        } else if(n / 7 == n % 7){
            System.out.print("1");
        } else {
            System.out.print("2");
        }
    }
}
