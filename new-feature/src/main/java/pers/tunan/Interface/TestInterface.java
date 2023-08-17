package pers.tunan.Interface;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/19
 */
public class TestInterface implements MyInterface{
    public static void main(String[] args) {
        MyInterface.method2();
        MyInterface.method3();
    }

    public void method1() {
        System.out.println("method1");
    }
}
