package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P10025 {
    static class Main{
        public static void main(String[] args){
            /*
            甲种酒精溶液中有酒精 A 千克，水B 千克;
            乙种酒精溶液中有酒精 C 千克，水 D 千克；
            要配制成 E% 的酒精溶液F千克，
            问两种酒精溶液各需多少千克？
             */
            // todo: 2023/8/16 未完成
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            double c = scanner.nextInt();
            double d = scanner.nextInt();
            double e = scanner.nextInt();
            double f = scanner.nextInt();
            double x = (f - e) * (b + d) / (e * (a + c));
            double y = (f - e) * (a + c) / (e * (b + d));
            System.out.println(String.format("%.2f", x) + " " + String.format("%.2f", y));
        }
    }
}
