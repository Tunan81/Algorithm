package pers.tunan.cqie;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/20
 */
public class P11003 {
    static class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            Boolean isRunYear = false;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                isRunYear = true;
            }
            Boolean isMonthEnd = false;
            if(month == 2){
                if (isRunYear){
                    if (day == 29){
                        isMonthEnd = true;
                    }
                } else {
                    if (day == 28){
                        isMonthEnd = true;
                    }
                }
            } else if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12){
                if (day == 31){
                    isMonthEnd = true;
                }
            } else {
                if (day == 30){
                    isMonthEnd = true;
                }
            }
            Boolean isYearEnd = false;
            if (month == 12 && day == 31){
                isYearEnd = true;
            }
            if (isYearEnd){
                System.out.println((year + 1) + " " + 1 + " " + 1);
            } else if (isMonthEnd){
                System.out.println(year + " " + (month + 1) + " " + 1);
            } else {
                System.out.println(year + " " + month + " " + (day + 1));
            }
        }
    }
}
