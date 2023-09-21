package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P11009 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int score = scanner.nextInt();
            if (score >= 90){
                System.out.println("A");
            } else if (score >= 80){
                System.out.println("B");
            } else if (score >= 70){
                System.out.println("C");
            } else if (score >= 60){
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
