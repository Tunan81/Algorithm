package pers.tunan.cqie;

import java.util.HashSet;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P20003_01 {
    static class Main {
        public static void main(String[] args) {
            int count = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 123; i <= 329; i++) {
                set.add(i / 100);
                set.add(i % 100 / 10);
                set.add(i % 10);

                set.add(2 * i / 100);
                set.add(2 * i / 100 % 10);
                set.add(2 * i % 10);

                set.add(3 * i / 100);
                set.add(3 * i % 100 / 10);
                set.add(3 * i % 10);
                if (set.size() == 8 && !set.contains(0)) {
                    count++;
                    set.clear();
                }
                set.clear();
            }
            System.out.println(count);
        }
    }
}
