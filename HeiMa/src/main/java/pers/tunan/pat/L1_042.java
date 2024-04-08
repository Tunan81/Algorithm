package pers.tunan.pat;

import java.util.Scanner;

public class L1_042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  string = sc.nextLine();
        String[] year = string.split("-");
        System.out.println(year[2] +"-"+ year[0] +"-"+ year[1]);
    }
}
