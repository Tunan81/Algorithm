package pers.tunan.recursion;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/17
 * @description 递归反向打印字符串
 */
public class ReversePrintString {
    public static void f(int n, String str){
        if (n == str.length()){
            return;
        }
        f(n + 1, str);
        System.out.println(str.charAt(n));
    }
}
