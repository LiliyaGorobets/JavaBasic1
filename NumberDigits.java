package ru.academits.java;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        int sumNum = 0;
        int sumOddNum = 0;
        int remainderDivision;
        int max = 0;
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(scanner.nextInt());
        num = Math.abs(num);
        while (num > 0) {
            remainderDivision = num % 10;
            sumNum = sumNum + remainderDivision;
            if (remainderDivision % 2 == 1)
                sumOddNum = sumOddNum + remainderDivision;
            if (max < remainderDivision)
                max = remainderDivision;
            num = num / 10;
        }
        System.out.println("Сумма всех цифр числа: " + sumNum);
        System.out.println("Сумма нечетных цифр числа: " + sumOddNum);
        System.out.println("Максимальная цифра числа: " + max);
    }
}