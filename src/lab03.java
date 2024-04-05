package src;

import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browder name");
        String browser = sc.nextLine();
        switch(browser) {
            case"chrome":
                System.out.println("will use this");
                break;
            case "edge":
                System.out.println("wil ue this");
                break;
            default:
                System.out.println("i dont know");
        }
    }
}
