package pers.tunan.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (true){
            int a = scanner.nextInt();
            list.add(a);
            count++;
            if (a == 250){
                break;
            }
        }
        System.out.println(count);
    }
}
