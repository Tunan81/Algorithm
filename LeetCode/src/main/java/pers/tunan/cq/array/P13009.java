package pers.tunan.cq.array;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/25
 */
public class P13009 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            set.stream().sorted().forEach(x -> System.out.print(x + " "));
        }
    }
}
