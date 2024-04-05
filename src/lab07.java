package src;

import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        x =x*x;
        y = y*y;
        double xySQ = x+y;
        System.out.println(xySQ);

    }
}
