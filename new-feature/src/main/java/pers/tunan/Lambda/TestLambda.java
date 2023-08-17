package pers.tunan.Lambda;

import java.util.function.Consumer;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/20
 */
public class TestLambda {
    public static void main(String[] args) {
        processString("Hello World", System.out::println);
    }
    static void processString(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }
}
