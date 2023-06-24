package SeminarJ1;

import java.util.Scanner;

public class Task1 {
  static boolean isTriangular(int num)
    {
        if (num < 0)
            return false;
        int sum = 0;
        for (int n = 1; sum <= num; n++)
        {
            sum = sum + n;
            if (sum == num)
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число = ");
        Integer number = iScanner.nextInt();
        int result = 1;
        
        if (isTriangular(number))
        {
            for (int i = 1; i <= number; i++)
                result *= i;
            }
        else
            System.out.print("Данное число не относится к треуголному ");
        System.out.println(result);

    }
            
    
}
