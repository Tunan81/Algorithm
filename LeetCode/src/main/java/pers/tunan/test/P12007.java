package pers.tunan.test;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/21
 */
public class P12007 {
    static class Main {
        public static void main(String[] args) throws IOException, URISyntaxException {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextInt();
            long k = scanner.nextInt();
            scanner.close();
            long sum = 0;
            if (n > k) {
                sum = k * (k + 1) / 2;
            } else {
                long y = k % n;
                long s = k / n;
                long number1 = 0;
                long number2 = 0;
                for (long i = 0; i < n; i++) {
                    number1 += i;
                }
                for (long i = 0; i <= y; i++) {
                    number2 += i;
                }
                sum = number1 * s + number2;
            }
            System.out.println(sum);

            try{
                int a = 1 / 0;
            } catch (Exception e){
                Desktop desktop = Desktop.getDesktop();
                if (Desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE)) {
                    URI uri = new URI("https://so.csdn.net/so/search?spm=1000.2115.3001.4498&q=" + e);
                    desktop.browse(uri);
                }
            }
        }
    }
}
