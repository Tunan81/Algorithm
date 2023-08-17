package pers.tunan.Interface;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/20
 */
public class Test {

    /**
     * 使用lambda表达式创建函数式接口对象
     */
    public static void main(String[] args) {
        FunctionalInterface myLambda = () -> System.out.println("myLambda");
        // 调用接口中的抽象方法
        myLambda.method1();
    }
}
