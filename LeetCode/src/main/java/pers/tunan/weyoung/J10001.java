package pers.tunan.weyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/15
 */
public class J10001 {

    static class Main {
        static int[] a = new int[30];
        static int[] b = new int[30];

        public static int isSame(String x) {
            for (int i = 0; i < 30; i++) {
                a[i] = 0;
            }

            for (int i = 0; i < x.length(); i++) {
                if (++a[x.charAt(i) - '0'] > 1) {
                    return 1;
                }
            }
            return 0;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;

            while ((line = reader.readLine()) != null) {
                String s = line.trim();
                if (isSame(s) == 1) {
                    System.out.println("NO");
                    continue;
                }
                //给b数组赋值
                for (int i = 0; i < 30; i++) {
                    b[i] = 0;
                }
                int pt = 1;
                for (int i = 0; i < s.length() - 1; i++) {
                    int x = s.charAt(i) - '0';
                    int y = s.charAt(i + 1) - '0';
                    b[x]++;
                    if (x > y) {
                        int temp = x;
                        x = y;
                        y = temp;
                    }
                    if ((x == 1 && (y == 3 || y == 7 || y == 9)) || (x == 2 && (y == 8))
                            || (x == 3 && (y == 7 || y == 9)) || (x == 4 && y == 6) || (x == 7 && y == 9)) {
                        if (b[(x + y) >> 1] == 0) {
                            System.out.println("NO");
                            pt = 0;
                            break;
                        }
                    }
                }
                if (pt == 1) {
                    System.out.println("YES");
                }
            }
        }
    }
}