package src;

import java.sql.SQLOutput;

public class lab11LeftTriangle {
    public static void main(String[] args) {
        int n = 100;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing stars for one row
        }
    }
}
