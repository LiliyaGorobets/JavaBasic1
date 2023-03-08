package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона: ");
        int firstNum = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int lastNum = scanner.nextInt();

        int sum = 0, sumEven = 0;
        int count = 0, countEven = 0;
        double average, averageEven;
        for (int i = firstNum; i <= lastNum; i++) {
            sum = sum + i;
            count++;
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                countEven++;
            }
        }
        average = (double) sum / count;
        System.out.println("Среднее арифметическое: " + average);
        averageEven = (double) sumEven / countEven;
        System.out.println("Среднее арифметическое четных чисел: " + averageEven);
    }
}