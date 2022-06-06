package com.company;

public class Main extends Methods{

        /**
         * Задание: напишите программу для подсчета суммы 3х целых чисел. Операция суммирования уже считанных чисел должна быть вынесена в отдельный метод.
         * @author Frolova SI
         */
        public static void main(String[] args) {
            int firstNumber, secondNumber, thirdNumber, sum, waterVolume;
            System.out.print("Введите первое число: ");
            firstNumber = scanNumber();
            System.out.print("Введите второе число: ");
            secondNumber = scanNumber();
            System.out.print("Введите третье число: ");
            thirdNumber = scanNumber();

            sum = sumNumber(firstNumber, secondNumber, thirdNumber);
            System.out.println("Сумма чисел = " + sum);
    }
}
