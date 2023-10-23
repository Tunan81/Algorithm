package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/12
 */
public class P11011 {
    static class Main{
        public static void main(String[] args){
            //有10箱产品，每箱有1000件，正品每件100克，其中1箱是次品，
            //每件次品比正品轻10克，问能否用称只称一次，就找出哪1箱是次品。
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // 一次称的重量
            int count = 0;
            for (int i = 1; i <= 10; i++){
                if ((1000 * 100 + i * 10) % n == 0){
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println(count);
        }
    }
}
