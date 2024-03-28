package pers.tunan.binarySearch;

import java.util.*;
import java.util.function.Predicate;

public class SerialNumberHandler {

    private static long currentId = 1L; // 用于模拟ID生成的计数器

    public static void main(String[] args) {
        List<String> serialNumbers = Arrays.asList(
                "1", "1.1", "1.1.1", "1.1.2", "1.1.3","1.1.3.1","1.1.3.1.1","1.1.3.1.1.1","1.1.4", "1.2", "2", "2.1", "2.1.1", "2.1.2", "2.2","3","4"
        );
        String num = "1.1★";
        ;
        num=num.substring(0,num.length()-1);
        int length = num.length();
        String finalNum = num;
        Optional<String> first = serialNumbers.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        if (s.charAt(s.length() - 1) == '★') {
                            ;
                            s = s.substring(0, s.length() - 1);
                        }
                        String substring = finalNum.substring(0, length - 2);
                        return length - s.length() <= 2 && substring.equals(s);
                    }

                }).findFirst();
        System.out.println(first.get());

    }

    /**
     * 解析序号并获取父ID
     * @param serialNumber 序号
     * @param idMap ID映射
     * @return 父ID
     */
    private static String parseSerialNumberAndParentId(String serialNumber, Map<String, Long> idMap) {
        String[] serialParts = serialNumber.split("\\.");
        StringBuilder parentSerial = new StringBuilder();

        // 获取当前层级的父ID
        for (int i = 0; i < serialParts.length - 1; i++) {
            parentSerial.append(serialParts[i]);
            if (i < serialParts.length - 2) {
                parentSerial.append(".");
            }
        }

        // 存储当前数据并从数据库获取ID
        Long currentParentId = idMap.get(parentSerial.toString());
        Long currentLevelId = storeToDatabaseAndGetId(serialNumber, currentParentId);

        // 将当前ID放入映射中
        idMap.put(serialNumber, currentLevelId);
        // 返回父级序号
        return parentSerial.toString();
    }

    private static Long storeToDatabaseAndGetId(String serialNumber, Long parentId) {
        // 在实际应用中，将数据插入数据库并获取生成的ID
        // 对于此示例，我们使用简单的计数器模拟ID生成
        long generatedId = currentId;
        currentId++;
        return generatedId;
    }
}
