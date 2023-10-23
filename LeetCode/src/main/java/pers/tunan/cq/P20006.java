package pers.tunan.cq;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/12
 */
public class P20006 {
    static class Main{
        public static void main(String[] args) {
            for (int i = 1; i < 10000; i++) {
                int a = i * i;
                int b = i * i * i;
                String s = a + String.valueOf(b);
                if (s.length() == 10) {
                    int[] arr = new int[10];
                    for (int j = 0; j < s.length(); j++) {
                        arr[s.charAt(j) - '0']++;
                    }
                    boolean flag = true;
                    for (int k : arr) {
                        if (k != 1) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
