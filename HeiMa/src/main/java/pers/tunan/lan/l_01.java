package pers.tunan.lan;

public class l_01 {
    public static void main(String[] args) {
        String str = Integer.toString(1000000,7);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += str.charAt(i) - '0';
        }
        System.out.println(count);
    }
}
