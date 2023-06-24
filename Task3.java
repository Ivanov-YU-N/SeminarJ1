package SeminarJ1;

import java.util.Scanner;

public class Task3 {
       public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число = ");
        Float y = iScanner.nextFloat();
        System.out.printf("Введите знак = ");
        Character sing = iScanner.next().charAt(0);
        System.out.printf("Введите второе число = ");
        Float x = iScanner.nextFloat();

        switch (sing) {
            case '+':
                System.out.println(y + x);
                break;
            case '-':
                System.out.println(y - x);
                break;
            case '/':
                System.out.println(y / x);
                break;
            case '*':
                System.out.println(y * x);
                break;
            case '%':
                System.out.println(y % x);
                break;
            default:
                System.out.println("Операция не распознана");
                
        }
    }
}
