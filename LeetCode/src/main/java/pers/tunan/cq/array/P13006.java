package pers.tunan.cq.array;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        int index = 0;
        int count = 0;
        while (count < n - 1){
            for (int i = 0; i < m; i++){
                if (arr[index] != 0){
                    if (i == m - 1){
                        arr[index] = 0;
                        count++;
                    }
                    index++;
                    if (index == n){
                        index = 0;
                    }
                }else {
                    index++;
                    if (index == n){
                        index = 0;
                    }
                    i--;
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/7
 */
public class P13006 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = i + 1;
            }
            int index = 0;
            int count = 0;
            while (count < n - 1){
                for (int i = 0; i < m; i++){
                    if (arr[index] != 0){
                        if (i == m - 1){
                            arr[index] = 0;
                            count++;
                        }
                        index++;
                        if (index == n){
                            index = 0;
                        }
                    }else {
                        index++;
                        if (index == n){
                            index = 0;
                        }
                        i--;
                    }
                }
            }
            for (int i = 0; i < n; i++){
                if (arr[i] != 0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
