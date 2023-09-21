package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P11012 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int chinese = scanner.nextInt();
            int math = scanner.nextInt();
            if (!(math < 60 && chinese < 60) && !(math >= 60 && chinese >= 60)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
