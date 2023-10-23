package pers.tunan.li;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/12
 */
public class C0008B {
    static class Main{
        public static void main(String[] args){
            int count = 0;
            for (int i = 10; i <= 99; i++){
                for (int i1 = 100; i1 <= 999; i1++){
                    int x = i * i1;
                    if (x >= 10000 && x <= 99999){
                        int[] ints = new int[10];
                        int a = i / 10;
                        int b = i % 10;
                        int c = i1 / 100;
                        int d = i1 / 10 % 10;
                        int e = i1 % 10;
                        ints[a] = 1;
                        ints[b] = 1;
                        ints[c] = 1;
                        ints[d] = 1;
                        ints[e] = 1;
                        ints[x / 10000] = 1;
                        ints[x / 1000 % 10] = 1;
                        ints[x / 100 % 10] = 1;
                        ints[x / 10 % 10] = 1;
                        ints[x % 10] = 1;
                        int sum = 0;
                        for (int anInt : ints) {
                            sum += anInt;
                        }
                        if (sum == 10){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
