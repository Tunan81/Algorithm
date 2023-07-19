package pers.tunan.LinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/15
 * @description 单向链表
 */
public class SinglyLinkedList implements Iterable<Integer>{

    /**
     * 头节点
     */
    private Node head = null;

    @Override
    public Iterator<Integer> iterator() {
        // 匿名内部类
        return new Iterator<Integer>() {
            Node p = head;
            @Override
            public boolean hasNext() { // 是否有下一个元素
                return p != null;
            }

            @Override
            public Integer next() { // 返回当前元素的值，并指向下一个元素
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    /**
     * 节点类
     */
    private static class Node {
        int value; // 值
        Node next; //下一个节点指针
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 链表头部添加元素
     * @param value 添加的元素
     */
    public void addFirst(int value){
        // 1.链表为空
        // head = new Node(value, null);
        // 2.链表非空
        head = new Node(value, head);
    }

    /**
     * 遍历链表
     */
    public void loop(Consumer<Integer> consumer){
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    /**
     * 遍历链表
     */
    public void loop2(Consumer<Integer> consumer){
        for (Node p = head; p != null; p = p.next){
            consumer.accept(p.value);
        }
    }

    private Node findLast(){
        Node p;

        for (p = head;p.next != null; p = p.next){

        }
        return p;
    }
}


