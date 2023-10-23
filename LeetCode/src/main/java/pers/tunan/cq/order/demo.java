package pers.tunan.cq.order;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/14
 */
public class demo {
    public static  Boolean checkIdCard(String ServiceManIdCard){

        //判断输入身份证号长度是否合法
        if (ServiceManIdCard.length() != 18) {
            throw new RuntimeException("身份证长度不合法");//不合法 抛出一个异常
        }
        //校验身份证真假
        int sum = 0;
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};//将加权因子定义为数组
        //遍历weight数组 求身份证前17项系数和
        for (int i = 0; i < weight.length; i++) {
            int n = ServiceManIdCard.charAt(i) - 48;//获取 身份证对应数
            int w = weight[i];
            sum += w * n;
        }
        //对11求余
        int index = sum % 11;
        //校验码
        String m = "10X98765432";
        //获取身份证最后一位进行比对
        boolean inCardFlag = m.charAt(index) == ServiceManIdCard.charAt(17);
        if(inCardFlag!=true){
            throw new RuntimeException("身份证不合法");//不合法 抛出一个异常
        }
        return true;
    }
    public static Boolean checkPhone(String ServiceManPhone){
        //        判断联系电话是否合法
        Pattern pattern= Pattern.compile("^1[3-9]\\d{9}$");
        Matcher matcher = pattern.matcher(ServiceManPhone);
        if (!matcher.matches()) {
            throw new RuntimeException("联系电话不合法");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIdCard("500227200204261618"));
    }
}
