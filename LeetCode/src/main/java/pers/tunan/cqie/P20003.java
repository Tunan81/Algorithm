package pers.tunan.cqie;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P20003 {
    static class Main{
        public static void main(String[] args){
            int count = 0;
            for (int i = 123; i <= 329; i++) {
                int a = i;
                int b = 2 * i;
                int c = 3 * i;
                int[] arr = new int[9];
                //第一个数的百位、十位、个位
                arr[0] = a / 100;
                arr[1] = a / 10 % 10;
                arr[2] = a % 10;
                // 第二个数的百位、十位、个位
                arr[3] = b / 100;
                arr[4] = b / 10 % 10;
                arr[5] = b % 10;
                // 第三个数的百位、十位、个位
                arr[6] = c / 100;
                arr[7] = c / 10 % 10;
                arr[8] = c % 10;
                int flag = 0;
                for (int j = 0; j < 9; j++) {
                    if (arr[j] == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    continue;
                }
                int[] arr2 = new int[9];
                for (int j = 0; j < 9; j++) {
                    arr2[arr[j] - 1]++;
                }
                int flag2 = 0;
                for (int j = 0; j < 9; j++) {
                    if (arr2[j] != 1) {
                        flag2 = 1;
                        break;
                    }
                }
                if (flag2 == 1) {
                    continue;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
