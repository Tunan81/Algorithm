package pers.tunan.recursion;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/17
 */
public class Factorial {
    public int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
    }
}
