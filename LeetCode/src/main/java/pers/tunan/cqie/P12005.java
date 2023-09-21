package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P12005 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (isSeven(i)){
                    count++;
                }
            }
            System.out.println(count);
        }

        public static boolean isSeven(int n){
            boolean flag = false;
            if (n % 7 == 0){
                flag = true;
            } else {
                while (n > 0){
                    if (n % 10 == 7){
                        flag = true;
                        return flag;
                    }
                    n /= 10;
                }
            }
            return flag;
        }
    }
}
