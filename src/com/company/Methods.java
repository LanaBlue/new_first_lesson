package com.company;

import java.util.Scanner;

public class Methods {
    /**
     * Считываем введеное число с клавиатуры
     */
    public static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Вычисляем сумму введеных чисел
     */
    public static int sumNumber(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }
}
