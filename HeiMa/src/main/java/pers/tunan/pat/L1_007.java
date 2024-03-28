package pers.tunan.pat;

import java.util.HashMap;
import java.util.Scanner;

public class L1_007 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"ling");
        hashMap.put(1,"yi");
        hashMap.put(2,"er");
        hashMap.put(3,"san");
        hashMap.put(4,"si");
        hashMap.put(5,"wu");
        hashMap.put(6,"liu");
        hashMap.put(7,"qi");
        hashMap.put(8,"ba");
        hashMap.put(9,"jiu");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String[] str = String.valueOf(s).split("");
        if (s < 0) {
            System.out.print("fu ");
            for (int i = 1; i < str.length; i++) {
                if (i == str.length - 1) {
                    System.out.println(hashMap.get(Integer.parseInt(str[i])));
                } else {
                    System.out.print(hashMap.get(Integer.parseInt(str[i])) + " ");
                }
            }
        } else {
            for (int i = 0; i < str.length; i++) {
                if (i == str.length - 1) {
                    System.out.println(hashMap.get(Integer.parseInt(str[i])));
                } else {
                    System.out.print(hashMap.get(Integer.parseInt(str[i])) + " ");
                }
            }
        }
    }
}
