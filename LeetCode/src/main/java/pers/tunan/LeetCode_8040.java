package pers.tunan;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/3
 */
public class LeetCode_8040 {
    static class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            int n = s.length();
            int zero = s.contains("0") ? n - 1 : n;//如果没有0则删除所有数，如果有0则最多删除n-1个数
            System.out.println(Math.min(zero, Math.min(f("00", s),Math.min(f("25", s),Math.min(f("50", s),f("75", s))))));
        }

        //求以00 25 50 75 结尾的数
        static int f(String t, String s) {
            int i = s.lastIndexOf(t.substring(1));
            if (i < 0) {
                return s.length();
            }
            i = s.substring(0, i).lastIndexOf(t.substring(0,1));
            if (i < 0) {
                return s.length();
            }
            return s.length() - i - 2;
        }
    }
}
