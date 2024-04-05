package src;

import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char user_input = sc.next().toCharArray()[0];
        switch (user_input){
            case 'a' :
                System.out.println("this is vowel");
                break;

            case 'e' :
                System.out.println("this is vowel");
                break;

            case 'i' :
                System.out.println("this is vowel");
                break;

            case 'o' :
                System.out.println("this is vowel");
                break;

            case 'u' :
                System.out.println("this is vowel");
                break;

            default:
                System.out.println("this is not a vowel");
        }

    }
}
