package pers.tunan.Interface;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/19
 */

public interface MyInterface {
    void method1();

    static void method2(){
        System.out.println("method2");
    }

    static void method3(){
        System.out.println("method3");
    }

    default void method4(){
        System.out.println("method4");
    }

    default int method5(){
        System.out.println("method5");
        return 0;
    }
}
