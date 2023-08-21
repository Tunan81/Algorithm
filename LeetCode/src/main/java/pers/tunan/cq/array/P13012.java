package pers.tunan.cq.array;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/18
 */
public class P13012 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int[] a = new int[1000000];
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            a[1] = 1;
            a[2] = n;
            for(int i = 3; i <= m; i++){
                if (a[i-1] > a[i-2]){
                    a[i] = a[i-1] - a[i-2];
                }else{
                    a[i] = a[i-2] - a[i-1];
                }
            }
            System.out.println(a[m]);
        }
    }
}
