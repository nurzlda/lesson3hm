package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Создать массив дробных чисел размером 15 элементов и наполнить его положительными и отрицательными числами
        double tempArray[] = {-5.9, 1.2, -8.5, 21.2, 3.41, 32.1, 54.8, -15.6, 3.2, 66.1, -76.8, -90.9, 43.1, -4.34, -8.56};
        double sum = 0;
        int count = 0;
        boolean isNegative = false;
        for (double temp : tempArray) {
            if (temp < 0) {
                isNegative = true;
            }

            if (isNegative) {
                if (temp > 0) {
                    sum = sum + temp;
                    count++;
                }
            }
            System.out.println(count);
            System.out.println("Sum = " + sum);
            System.out.println("average = " + sum / count);


        }
    }
}











